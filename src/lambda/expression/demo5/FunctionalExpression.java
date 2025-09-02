package lambda.expression.demo5;

import java.util.function.BiFunction;

class FunctionalExpression {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> operation = (x, y) -> x / y;
        System.out.println(operation.apply(10, 3));
    }
}
/*
* BiFunction<Input, Input, Output> -> 2 inputs 1 output
*
* Method name -> apply();
*
* */
