package lambda.expression.demo7;

import java.util.function.BiConsumer;

public class FunctionalExpression {
    public static void main(String[] args) {
        BiConsumer<String, Integer> operation = (language, version) ->
                System.out.println("Language: "+ language + " version: " + version);

        operation.accept("java", 21);
    }
}
