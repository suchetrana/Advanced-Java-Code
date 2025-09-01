package lambda.expression.demo6;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation operation = (x, y) -> x > y;

        System.out.println(operation.isGreater(43, 43));
    }
}
