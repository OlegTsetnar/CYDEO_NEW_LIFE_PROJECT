package com.cydeo.stereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        container.getBean(Agile.class).getTeachingHours();

        container.getBean(Selenium.class).getTeachingHours();
    }
}
