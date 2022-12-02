package Employees;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Employee_Test {
    public static void main(String[] args) {

        Employee_Data.readData().sorted(Comparator.comparing(Employee::getEmpId))
                .map(Employee::getEmpName)
                .forEach(System.out::println);


        Employee_Data.readData().flatMap(employee -> employee.getEmpPhones().stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);





    }
}
