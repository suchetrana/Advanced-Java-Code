package lambda.expression.demo5;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation operation = (x, y) -> x / y;
        System.out.println(operation.divide(10, 3));
    }
}
