package Calculator;

import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        // reference to static method (directly)
        Calculate calculate1 = (x, y) -> Calculator.findSum(x, y);
        calculate1.calculate(10, 10);

        Calculate calculate2 = Calculator::findSum;
        calculate2.calculate(15, 15);

        //reference to instance method
        Calculate calculate3 = (x, y) -> new Calculator().findMultiply(x, y);
        calculate3.calculate(5, 5);

        Calculate calculate4 = new Calculator()::findMultiply;
        calculate4.calculate(10, 5);

        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(20);
    }
}
