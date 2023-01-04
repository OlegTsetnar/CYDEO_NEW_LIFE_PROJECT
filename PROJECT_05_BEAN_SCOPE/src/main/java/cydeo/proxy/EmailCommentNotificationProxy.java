package cydeo.proxy;

import cydeo.model.Comment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
 @Qualifier("EMAIL") //change bean name - if we have two o more with same name
// @Primary    - when we want to run one of the @bean with same method name
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "+ comment.getText());
    }
}
