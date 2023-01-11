package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("register") // use GET to get empty field view
    public String showForm(Model model) {
        model.addAttribute("mentor", new Mentor());   // new object with empty fields,
        List<String> batchList = Arrays.asList("JD1", "JD2", "EU1", "EU2", "B18", "B20");
        model.addAttribute("batchList", batchList);

        return "/mentor/mentor-register";
    }

    @PostMapping("/confirm") // use POST after when we fill out the fields and want to POST
    public String showForm2(@ModelAttribute("mentor") Mentor mentor) {    //@ModelAttribute -- to catch data of just created object

        System.out.println(mentor); // to check it out

               return "/mentor/mentor-confirmation";
       // return "redirect:/mentor/register";             // redirect to page which is mention
    }
}
