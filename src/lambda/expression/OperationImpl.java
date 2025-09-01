package lambda.expression;

public class OperationImpl implements Operation{
    @Override
    public int increment(int num) {
        return ++num;
    }
}
