package lambda.expression.demo8;

import java.io.IOException;
import java.util.function.BiFunction;

public class FunctionalExpression {
    public static void main(String[] args) throws IOException {
        try {
            BiFunction<Integer, Integer, Integer> operation = (x, y) -> {
                try {
                    if (y == 0) {
                        throw new IOException("Cannot divide 0.");
                    }
                    return x / y;
                } catch (IOException exception) {
                    throw new RuntimeException(exception);
                }
            };
            int result = operation.apply(10, 0);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
