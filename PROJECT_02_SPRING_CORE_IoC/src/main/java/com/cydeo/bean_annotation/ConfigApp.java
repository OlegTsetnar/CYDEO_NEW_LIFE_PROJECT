package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean (name = "p1")    // when we have a same object we can insert the name of type to avoid the failure in run class
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }
    @Bean (name = "p2")
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }
}

