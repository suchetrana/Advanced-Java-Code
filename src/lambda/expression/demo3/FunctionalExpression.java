package lambda.expression.demo3;

import java.util.function.Consumer;

class FunctionalExpression {
    public static void main(String[] args) {
        Consumer <Integer> operation = num ->
                System.out.println("You are learning JAVA-" + num +" version.");
        operation.accept(21);
    }
}

/*
* 3. Consumer<T>

Input type: T

Return type: void
Method name: accept();
Use case: Consumes the input and performs some operation, no return.
Example: print a value.
* */
