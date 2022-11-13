package Lambda_3C_use_Predicate_Apple.Lambda_1B_behavior_parameterization;

public class Sort_by_weight implements Sort {

    @Override public boolean sort(Apple apple) {
        return (apple.getWeight()>150);
    }
}
