package com.cydeo.controller;


import com.cydeo.boostrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());

        return "/employee/employee-create";
    }

    @PostMapping("/list")
    public String listForm(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model) {

        // if we have any error related to our object it will stay on a same page
        if (bindingResult.hasErrors()) {
            // add states here because it is different controller, we added employee using @ModelAttribute("employee"), but states we still should to add
          model.addAttribute("states", DataGenerator.getAllStates());

            return "/employee/employee-create";
        }
        DataGenerator.safeEmployee(employee);
        model.addAttribute("employees", DataGenerator.readAllEmployee());
        return "/employee/employee-list";
    }

}
