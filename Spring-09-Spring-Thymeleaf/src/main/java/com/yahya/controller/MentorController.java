package com.yahya.controller;

import com.yahya.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

//Lombok Annotations
@Controller
@RequestMapping("/mentor")
public class MentorController {

    // pointing to get request
    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("mentor", new Mentor());

        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3");
        model.addAttribute("batchList", batchList);

        return "mentor/mentor-register";
    }

    // pointing to post request
    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor){

        // print output to server
        System.out.println(mentor.toString());
//        return "mentor/mentor-confirmation";
        // redirect to same page after submitting form
        return "redirect:/mentor/register";
    }
}
