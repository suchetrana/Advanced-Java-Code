package lambda.expression.demo1;

public class OperationImpl implements Operation {
    @Override
    public int increment(int num) {
        return ++num;
    }
}
