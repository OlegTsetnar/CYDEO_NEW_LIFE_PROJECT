package cydeo.service;

import cydeo.model.Comment;
import cydeo.proxy.CommentNotificationProxy;
import cydeo.proxy.CommentPushNotificationProxy;
import cydeo.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}

