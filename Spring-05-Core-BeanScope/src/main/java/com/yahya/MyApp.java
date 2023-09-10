package com.yahya;

import com.yahya.config.ProjectConfig;
import com.yahya.model.Comment;
import com.yahya.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");
        comment.setAuthor("James");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        CommentService commentService1 = context.getBean(CommentService.class);

        System.out.println(commentService);
        System.out.println(commentService1);

        // call comment service// why aren't changes being saved
        System.out.println(commentService != commentService1);
    }
}
