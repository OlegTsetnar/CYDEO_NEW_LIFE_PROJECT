package day_07_Algo_solve;

import java.util.HashMap;
import java.util.Map;


public class String_Find_First_Not_Repeated_Char {
    public static void main(String[] args) {

        String word = "a green apple";

        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        var chars = word.toCharArray();

        for (Character each: chars) {
            if(map.containsKey(each)){
                count = map.get(each);
                map.put(each,count+1);
            } else {
                map.put(each,1);
            }
        }
        System.out.println(map);
            for (Character each: chars) {
             if(map.get(each)==1 && each.charValue()!=' '){
                 System.out.println(each);
                 break;
             }
        }
    }
}
