package com.yahya.proxy;

import com.yahya.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
