package Inner_Classes;

//interface Sample{
//    public void execute();
//}

abstract class Sample{
    public abstract void execute();
}
public class AnonymousClass {

    public static void main(String[] args) {
        Sample sample = new Sample() {
            @Override
            public void execute() {
                System.out.println("Yes I did run.");
            }
        };
        sample.execute();
    }
}
