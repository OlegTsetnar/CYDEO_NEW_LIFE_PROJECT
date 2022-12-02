package Employees;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    int empId;
    String empName;
    String empEmail;
    List<String> empPhones;

}
