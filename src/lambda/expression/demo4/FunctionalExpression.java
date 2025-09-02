package lambda.expression.demo4;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class FunctionalExpression {
    public static void main(String[] args) {
        Supplier<LocalDateTime> operation = () -> LocalDateTime.now();
        System.out.println(operation.get());
    }
}
/*
* 4. Supplier<T>

Input type: None

Return type: T

* Method name: get();
Use case: Supplies a value without taking input.
Example: generate a random number.
* */
