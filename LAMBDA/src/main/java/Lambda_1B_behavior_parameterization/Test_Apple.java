package Lambda_1B_behavior_parameterization;

import java.util.ArrayList;
import java.util.List;

public class Test_Apple {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.RED, 150));
        inventory.add(new Apple(Color.GREEN, 100));
        inventory.add(new Apple(Color.GREEN, 200));
        inventory.add(new Apple(Color.RED, 260));
        inventory.add(new Apple(Color.GREEN, 150));
        inventory.add(new Apple(Color.RED, 160));


        //behavior parameterization

//        List<Apple>heavyPredicate = sorting(inventory, new Sort_by_weight());
//        System.out.println(heavyPredicate);

       List<Apple> weightApple = sorting(inventory,apple -> apple.getWeight()>200);
        System.out.println(weightApple);
//
//        List<Apple>colorPredicate = sorting(inventory, new Sort_by_color());
//        System.out.println(colorPredicate);

        List<Apple> colorApple = sorting(inventory,apple -> apple.getColor().equals(Color.RED));
        System.out.println(colorApple);

    }

    public static List<Apple> sorting(List<Apple> inventory, Sort sortApple) {

        List<Apple> selectedApple = new ArrayList<>();
        for (Apple apple : inventory) {
            if (sortApple.sort(apple)) {
                selectedApple.add(apple);
            }
        }
        return selectedApple;
    }
}
