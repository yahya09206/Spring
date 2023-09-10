package com.yahya.proxy;

import com.yahya.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Push")
public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending push notificcation for comment " + comment.getText());
    }
}
