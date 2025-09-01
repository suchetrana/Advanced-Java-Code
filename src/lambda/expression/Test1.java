package lambda.expression;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();
        int result = operation.increment(10);
        System.out.println(result);
    }
}
