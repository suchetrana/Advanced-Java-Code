package lambda.expression.demo1;

public class Test2 {
    public static void main(String[] args) {
        Operation operation = new Operation() {  // Anonymous class method
            @Override
            public int increment(int num) {
                return ++num;
            }
        };
        System.out.println(operation.increment(101));
    }
}
