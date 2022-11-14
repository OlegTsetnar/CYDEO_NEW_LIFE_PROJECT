package Double_Colon_2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        // Zero-argument

        Supplier<Car> s1 = () -> new Car();
        System.out.println(s1.get().getModel());

        Supplier<Car> s2 = Car::new;
        System.out.println(s2.get().getModel());

        // One Argument

        Function<Integer, Car> function = (model) -> new Car(model);
        Car bmw = function.apply(2016);
        System.out.println(bmw.getModel());

        Function<Integer, Car> function1 = Car::new;
        Car audi = function1.apply(2020);
        System.out.println(audi.getModel());

        //Two argument
        BiFunction<String,Integer,Car> biFunction = (make, model) -> new Car(make, model);
        Car honda  = biFunction.apply("Honda",2023);
        System.out.println(honda.getMake()+ " " +honda.getModel());

        BiFunction<String,Integer,Car> biFunction2 = Car::new;
        Car infiniti  = biFunction2.apply("QX60",2023);
        System.out.println(infiniti.getMake()+ " " +infiniti.getModel());



    }
}
