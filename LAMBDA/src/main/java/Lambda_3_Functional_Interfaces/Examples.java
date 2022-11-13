package Lambda_3_Functional_Interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Examples {
    public static void main(String[] args) {

        //*************PREDICATE********************//

        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override public boolean test(Integer integer) {
                return integer < 18;
            }
        };

        Predicate<Integer> lesser = integer -> integer < 18;
        Boolean result = lesser.test(50);
        System.out.println(result);

        //*************CONSUMER********************//

        Consumer<Integer> display = integer -> System.out.println(integer);
        display.accept(20);

        //*************BI-CONSUMER********************//

        BiConsumer<Integer, Integer> biConsumer = (int1, int2) -> System.out.println(int1 + int2);
        biConsumer.accept(20, 20);

        //*************FUNCTION********************//

        Function<Integer, String> function = num -> num + " apple";    // 1st param - input param; 2nd param - return type;
        String str = function.apply(5);
        System.out.println(str);

        //*************SUPPLIER********************//

        Supplier <Double> supplierResult = () -> Math.random();
        Double num = supplierResult.get();
        System.out.println(num);
    }
}
