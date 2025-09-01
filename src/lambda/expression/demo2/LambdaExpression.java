package lambda.expression.demo2;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation operation =  num -> num >= 0;
        System.out.println(operation.isPositive(-20));
    }
}
