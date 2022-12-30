package cydeo;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

    //Field Injection
//    @Autowired
//    OfficeHour officehour;

    OfficeHour officehour;

    @Autowired
    public Java(OfficeHour officehour) {
        this.officehour = officehour;
    }

    public void getTeachingHours() {
        System.out.println("Weekly hours: " +
                (20 + officehour.getHours()));
    }
}



