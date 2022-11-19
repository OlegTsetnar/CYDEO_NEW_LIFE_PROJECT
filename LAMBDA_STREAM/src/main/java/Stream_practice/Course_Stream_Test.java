package Stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Course_Stream_Test {
    public static void main(String[] args) {

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Spring", 102),
                new Course("MS", 102)
        );

        Stream<Course> stream = myCourses.stream();


        //Creating Stream from values

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);








    }
}
