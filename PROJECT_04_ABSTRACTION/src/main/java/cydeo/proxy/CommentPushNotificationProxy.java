package cydeo.proxy;

import cydeo.model.Comment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override public void sendComment(Comment comment) {
        System.out.println("Push notification for comment: " + comment.getText());
    }
}
