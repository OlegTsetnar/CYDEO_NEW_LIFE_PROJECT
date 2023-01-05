package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {


    @RequestMapping("/info")
    /* when I request localhost:8080/car/info?make=honda
    I want to print honda
    */
    public String carInfo(@RequestParam String make,@RequestParam Integer year, Model model) {
        System.out.println(make);

/*
 then we want to paste this make- honda into html
 */
        model.addAttribute("make", make);
        model.addAttribute("year",year);
        return "car/info";
    }

    @RequestMapping("/info2")
    public String carInfo2
             /* when I request localhost:8080/car/info2?make=honda -->honda
     when I request localhost:8080/car/info2 -->tesla
    */
            (@RequestParam(value = "make", defaultValue = "Tesla") String make, Model model) {
        System.out.println(make);

        model.addAttribute("make", make);

        return "car/info";
    }

    @RequestMapping("/info/{make}/{year}") //localhost8080/info/honda
    public String getCarInfo2 (@PathVariable String make, @PathVariable Integer year, Model model) {


        model.addAttribute("make", make);
        model.addAttribute("year",year);

        return "car/info";
    }
}
