package lambda.expression.demo6;

import java.util.function.BiPredicate;

public class FunctionalExpression {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> operation = (x, y) -> x > y;

        System.out.println(operation.test(43, 43));
    }
}
