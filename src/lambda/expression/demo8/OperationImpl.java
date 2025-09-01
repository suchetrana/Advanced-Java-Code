package lambda.expression.demo8;

class OperationImpl implements Operation {
    @Override
    public int divide(int x, int y) {
        try {
            if (y == 0) throw new Exception("cannot divide by zero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return  -1;
        }
        return x / y;
    }
}
