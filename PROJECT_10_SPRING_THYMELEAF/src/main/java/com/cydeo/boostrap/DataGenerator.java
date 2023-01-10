package com.cydeo.boostrap;

import com.cydeo.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;


public class DataGenerator {


    public static List<Student> createStudents() {

        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 50), new Faker().address().state())
        );
        return students;
    }
}
