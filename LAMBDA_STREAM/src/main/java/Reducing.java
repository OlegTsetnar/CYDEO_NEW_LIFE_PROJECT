import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //sum
        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        // optional sum
        Optional<Integer> numbers2 = numbers.stream().reduce((a,b)->a+b);
        System.out.println(numbers2);

        Optional<Integer> numbers5 = numbers.stream().reduce(Integer::sum);
        System.out.println(numbers5);

        //max and min
        Optional<Integer> numbers3 = numbers.stream().reduce(Integer::max);
        System.out.println(numbers3);
        Optional<Integer> numbers4 = numbers.stream().reduce(Integer::min);
        System.out.println(numbers4);
    }
}
