package com.cydeo.controller;

import com.cydeo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    // @RequestMapping("/register")
    @GetMapping("/register")              // Just on method level
    public String homePage(Model model) {
        model.addAttribute("students", DataGenerator.createStudents());
        return "/student/register";
    }


    // @RequestMapping("/welcome")
    @GetMapping("/welcome")
    public String info(@RequestParam String id, Model model) {
        model.addAttribute("id", id);


        return "/student/welcome";
    }
}
