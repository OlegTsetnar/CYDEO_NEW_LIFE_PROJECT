package Lambda_3C_use_Predicate_Apple.Lambda_1B_behavior_parameterization;

public class Sort_by_color implements Sort {

    @Override public boolean sort(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
