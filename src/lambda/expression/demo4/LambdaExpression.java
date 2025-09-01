package lambda.expression.demo4;

import java.time.LocalDateTime;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation operation  = () -> LocalDateTime.now();
        System.out.println(operation.generate());
    }
}
