package Employees;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Employee_Data {
    public static Stream<Employee> readData() {

        return Stream.of(
                new Employee(100, "Roland", "o@gmail.com", Arrays.asList("1112233", "332211")),
                new Employee(90, "Fry", "f@gmail.com", Arrays.asList("111333", "333111")),
                new Employee(110, "Andy", "a@gmail.com", Arrays.asList("888666", "666555"))

        );

    }
}
