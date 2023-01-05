package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotate the class with @controller stereotype annotation (same like @Component)
public class UserController {

    @RequestMapping("/userinfo") //use it to associate the action with HTTP request path
    public String user(){
        return "userinfo.html"; //return HTML document that contains the details we want to browser to display
    }
}
