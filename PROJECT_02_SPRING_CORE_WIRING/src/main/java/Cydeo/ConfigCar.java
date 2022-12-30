package Cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car() {
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    @Bean (name = "p1")
    Person person() {
        Person p = new Person();
        p.setName("Mike");
        return p;
    }

    @Bean (name = "p2")   //autowiring
    Person person(Car car) {
        Person p = new Person();
        p.setCar(car);
        p.setName("Nick");
        return p;
    }

//    @Bean (name = "p2")   //Direct wiring
//    Person person(Car car) {
//        Person p = new Person();
//        p.setCar(car());
//        p.setName("Nick");
//        return p;
//    }

}
