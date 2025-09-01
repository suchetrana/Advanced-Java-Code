package lambda.expression.demo6;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();
        System.out.println(operation.isGreater(20, 90));

        Operation operation1 = new Operation() {
            @Override
            public boolean isGreater(int x, int y) {
                return x > y;
            }
        };
        System.out.println(operation1.isGreater(89, 78));
    }
}