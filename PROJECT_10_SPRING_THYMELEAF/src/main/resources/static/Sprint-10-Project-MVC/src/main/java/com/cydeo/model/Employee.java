package com.cydeo.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {


    //    @NotNull            // Except null, anything can be accepted
    //    @NotEmpty           // Except null and empty String anything can be accepted
    //    @NotBlank           // Except null, empty String and only space anything can be accepted.

    @NotBlank   // Oleg
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}

