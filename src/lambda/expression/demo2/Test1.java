package lambda.expression.demo2;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();
        boolean result = operation.isPositive(-10);
        System.out.println(result);
    }

}
