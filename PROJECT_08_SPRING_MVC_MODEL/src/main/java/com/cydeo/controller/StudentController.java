package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     // stereotype annotation (same as @Component)
public class StudentController {

    @RequestMapping("/welcome")   //end point in browser: "localhost:8080/welcome" We should see: Cydeo and MVC
    public String homePage(Model model) {   // involve MODEL interface to use its method and manipulate with HTML file

        model.addAttribute("name", "Cydeo");  //<h2 th:text="${name}"></h2>
        model.addAttribute("course", "MVC");  //<h2 th:text="${course}"></h2>

        return "/student/welcome";   //path to HTML file
    }



    @RequestMapping("/welcome")
    //end point in browser: "localhost:8080/welcome" We should see: empty screen. Because Model.attribute belong to method, they are local
    public String homePage2() {
        return "/student/welcome";   //path to HTML file
    }
}


