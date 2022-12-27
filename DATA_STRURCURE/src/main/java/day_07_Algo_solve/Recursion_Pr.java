package day_07_Algo_solve;

public class Recursion_Pr {
    public static void main(String[] args) {
        System.out.println(recursionNum(2, 3));
    }

    static int recursionNum(int x, int y) {
        if (y == 1)
            return x;
        else
            return x * recursionNum (x, y - 1);
    }
}
