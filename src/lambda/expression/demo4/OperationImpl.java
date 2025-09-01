package lambda.expression.demo4;

import java.time.LocalDateTime;

class OperationImpl implements Operation{
    @Override
    public LocalDateTime generate() {
        return LocalDateTime.now();
    }
}
