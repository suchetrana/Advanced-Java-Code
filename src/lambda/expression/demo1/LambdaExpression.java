package lambda.expression.demo1;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation operation = (num) -> ++num;  // Lambda expression
        System.out.println(operation.increment(101));
    }
}
