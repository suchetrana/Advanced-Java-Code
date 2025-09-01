package lambda.expression.demo4;

import java.time.LocalDateTime;

class Test1 {
    public static void main(String[] args) {

//        M1 : Using creating implement class
        Operation operation0 = new OperationImpl();
        System.out.println(operation0.generate());

//        M2 : Using Anonymous class
        Operation operation = new Operation() {
            @Override
            public LocalDateTime generate() {
                return LocalDateTime.now();
            }
        };
        System.out.println(operation.generate());
    }
}
