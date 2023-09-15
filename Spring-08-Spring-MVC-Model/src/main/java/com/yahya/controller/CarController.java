package com.yahya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info") //localhost:8080
    public String carInfo(@RequestParam String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }
}
