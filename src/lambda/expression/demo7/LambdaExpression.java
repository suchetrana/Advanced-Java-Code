package lambda.expression.demo7;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation operation = (language, version) ->
                System.out.println("Language: "+ language + " version: " + version);

        operation.print("java", 25);
    }
}
