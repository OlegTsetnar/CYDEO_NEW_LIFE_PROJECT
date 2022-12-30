package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext applicationContextContainer =
                new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor fullTimeMentor = applicationContextContainer.getBean(FullTimeMentor.class);

        fullTimeMentor.createAccount();

        String str = applicationContextContainer.getBean(String.class);
        System.out.println(str);

        Integer number = applicationContextContainer.getBean(Integer.class);
        System.out.println(number);

        PartTimeMentor partTimeMentor = applicationContextContainer.getBean("p1",PartTimeMentor.class);

        partTimeMentor.createAccount();



    }
}
