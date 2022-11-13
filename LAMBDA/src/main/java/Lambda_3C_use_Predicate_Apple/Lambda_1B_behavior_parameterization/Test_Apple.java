package Lambda_3C_use_Predicate_Apple.Lambda_1B_behavior_parameterization;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

        List<Apple> weightApplePredicate = sorting(inventory, predicate1 -> predicate1.getWeight()>300);
        System.out.println(weightApplePredicate);

//
//        List<Apple>colorPredicate = sorting(inventory, new Sort_by_color());
//        System.out.println(colorPredicate);

        List<Apple> colorApple = sorting(inventory,apple -> apple.getColor().equals(Color.RED));
        System.out.println(colorApple);

        List<Apple> colorApplePredicate = sorting(inventory, predicate2 ->predicate2.getColor().equals(Color.GREEN));
        System.out.println(colorApplePredicate);
    }

    public static List<Apple> sorting(List<Apple> inventory, Predicate<Apple> predicate) {

        List<Apple> selectedApple = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                selectedApple.add(apple);
            }
        }
        return selectedApple;
    }
}
