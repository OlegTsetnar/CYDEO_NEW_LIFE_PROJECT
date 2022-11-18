import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compare_Apple {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(340, Color.RED));
        inventory.add(new Apple(120, Color.GREEN));
        inventory.add(new Apple(540, Color.RED));
        inventory.add(new Apple(240, Color.GREEN));

        Comparator <Apple> sortApple = Comparator.comparing(Apple::getWeight);

        inventory.sort(Comparator.comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        System.out.println(inventory);
    }
}
