package cydeo;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium {
    //Field Injection
//    @Autowired
//    OfficeHour officeHour;

    OfficeHour officeHour;

    // Constructor
    @Autowired
    public Selenium(OfficeHour officeHour) {
        this.officeHour = officeHour;
    }

    public void getTeachingHours() {
        System.out.println("Weekly hours: " +
                (10 + officeHour.getHours()));
    }
}