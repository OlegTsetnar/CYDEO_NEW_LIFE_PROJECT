package Cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = container.getBean(Car.class);
        System.out.println(c.getMake());

        Person p = container.getBean("p2", Person.class);
        System.out.println(p.getName());
        System.out.println(p.getCar());

    }
}
