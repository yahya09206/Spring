package com.yahya.proxy;

import com.yahya.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending Notifications for comment " + comment.getText());
    }
}
