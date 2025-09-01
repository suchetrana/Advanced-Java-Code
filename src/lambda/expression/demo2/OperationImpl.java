package lambda.expression.demo2;

public class OperationImpl implements Operation{
    @Override
    public boolean isPositive(int num) {
        return num >= 0;
    }
}
