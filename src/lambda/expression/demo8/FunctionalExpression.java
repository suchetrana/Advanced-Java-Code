package lambda.expression.demo8;

import java.io.IOException;

public class FunctionalExpression {
    public static void main(String[] args) throws IOException {
        try {
            Operation operation = (x, y) -> {
                if (y == 0) {
                    throw new NullPointerException("Cannot divide 0.");
                }
                return x / y;
            };
                int result = operation.divide(10, 0);
                System.out.println(result);
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
