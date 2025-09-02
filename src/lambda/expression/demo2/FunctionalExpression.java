package lambda.expression.demo2;

import java.util.function.Predicate;

class FunctionalExpression {
    public static void main(String[] args) {

        Predicate<Integer> operation = num -> num >= 0;
        System.out.println(operation.test(-10));
    }
}

/*
* 2. Predicate<T>

Input type: T

Return type: boolean

* Method name: test();
Use case: Used for conditional checks (true/false).
Example: check if a number is even.*/
