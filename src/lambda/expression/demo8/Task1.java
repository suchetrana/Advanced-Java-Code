package lambda.expression.demo8;

public class Task1 {
    public static void main(String[] args) {

        Operation operation = new OperationImpl();
        System.out.println(operation.divide(2,0));

        Operation operation1 = new Operation() {
            @Override
            public int divide(int x, int y) {
                return x/y;
            }
        };
        System.out.println(operation1.divide(11, 9));
    }
}
