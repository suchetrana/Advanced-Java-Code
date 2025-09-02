package lambda.expression.demo1;

import java.util.function.Function;
 class FunctionalExpression {
    public static void main(String[] args) {
        Function<Integer, Integer> operation4 = (num) -> ++num;  // Lambda expression
        System.out.println(operation4.apply(101));


    }
}

/*

1. Function<T, R>

Input type: T

Return type: R

Method name: apply();
Use case: Takes one argument, returns a result.
Example: convert String → Integer.


* */
