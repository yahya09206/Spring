package com.yahya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info") //localhost:8080/car/info?make=gt3rs&year=2023
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model){

        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }

    // to endpoint using path variable
    @RequestMapping("/info/{make}")
    public String getCarInfo(@PathVariable String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }
}
