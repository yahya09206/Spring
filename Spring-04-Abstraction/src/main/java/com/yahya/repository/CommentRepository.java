package com.yahya.repository;

import com.yahya.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
