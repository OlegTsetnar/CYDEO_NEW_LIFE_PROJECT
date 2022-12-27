package day_07_Algo_solve;

import java.util.HashSet;
import java.util.Set;

public class String_First_repeated_char {
    public static void main(String[] args) {

        String word = "a green apple";

        Set<Character> set = new HashSet<>();

        var chars = word.toCharArray();

        for (Character each : chars) {
            if (set.contains(each)) {
                System.out.println(each);
                break;
            }
            set.add(each);

        }
    }
}
