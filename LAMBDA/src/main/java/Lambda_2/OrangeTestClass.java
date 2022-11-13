package Lambda_2;

import java.util.ArrayList;
import java.util.List;

public class OrangeTestClass {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build()); //with build you can skip a field, in constructor you can't do that (example: you can't skip weight in constructor if it is required)
        inventory.add(Orange.builder().weight(150).color(Color.RED).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).color(Color.RED).build());
        inventory.add(Orange.builder().weight(150).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(380).color(Color.RED).build());

       OrangeFormatter orangeFormatter = orange -> {
         String characteristic = orange.getWeight()>150 ? "Heavy":"Light";
         return "A " +characteristic+ " " +orange.getColor()+ " Orange";
       };
        prettyPrint(inventory,orangeFormatter);

/** if we have 2nd INTERFACE with same abstract method and same signature: can we do this execution?
 * We can input 2nd interface instead  OrangeFormatter orangeFormatter1 and make the same execution
  **/

        OrangeFormatter orangeFormatter1 = orange -> {
           String characteristic =  orange.getColor().equals(Color.GREEN)+ "color";
            return characteristic+orange.getWeight();
        };
       prettyPrint(inventory,orangeFormatter1);

    }

    public static void prettyPrint(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange: inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
