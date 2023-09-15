package com.yahya.controller;

import com.yahya.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        // random student id
        int studentId = new Random().nextInt();
        model.addAttribute("studentId", studentId);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);


        return "student/welcome";
    }
}
