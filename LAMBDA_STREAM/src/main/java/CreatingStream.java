import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {


        String [] str = {"JS","TS","Java"};
        Stream<String> stream = Arrays.stream(str);


        // creating Stream from Collection
        List<String> courseList = Arrays.asList("Java","TS","DS");
        Stream<String> stream2 = courseList.stream();

    }
}
