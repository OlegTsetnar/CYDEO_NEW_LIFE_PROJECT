package day_07_Algo_solve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestRangeOfNumbers {
    public static void main(String[] args) {

        Integer[] list = {1, 11, 3, 2, 15, 2, 4, 10, 7, 12, 11, 6};

        Map<Integer, Boolean> map = new HashMap<>();

        int[] bestRange = new int[2];
        int longestLength = 0;

        for (int each : list) {
            map.put(each, false);
        }

        for (int each : list) {
            if (map.get(each)) {
                continue;
            }
            map.put(each, true);
            int currentLength = 1;
            int left = each-1;
            int right = each+1;
            while (map.containsKey(left)) {
                map.put(left, true);
                left--;
                currentLength++;
            }
            while (map.containsKey(right)) {
                map.put(right, true);
                right++;
                currentLength++;
            }
            if (currentLength>longestLength){
                longestLength =currentLength;
                bestRange = new int[]{left+1,right-1};
            }

        }
        System.out.println(Arrays.toString(bestRange));
    }
}
