package cydeo.service;

import cydeo.model.Comment;
import cydeo.proxy.CommentNotificationProxy;
import cydeo.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
// @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Lazy // When we inject the object in constructor CommentService and add System.out.println("HELLO") it will  not print "HELLO" with @Lazy when we comment everything in CydeoApp class, without @Lazy it will print it
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    // Need to initialize final, we use constructor for it
    /*
     * @Qualifier: when we have two Services classes and system don't know which @bean should be injected
     * because we have two @beans with same method name: "sendComment" in "CommentPushNotificationProxy class" and "EmailCommentNotificationProxy class".
     * In this cse we can use @Qualifier(EmailCommentNotificationProxy) or create custom @Qualifier("EMAIL")
     *  */
    public CommentService(CommentRepository commentRepository,
            @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("HELLO");
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}

