package Inner_Classes;
class OuterClass1 {
    static int val = 5;
    String name = "OuterClass";
    static class InnerClass{
        void execute(){
            System.out.println("Inside Inner Class !!!"+val);
        }
    }
    public void execute(){
        InnerClass innerClass = new InnerClass();
        innerClass.execute();
    }
}
public class StaticClass {
    public static void main(String[] args) {
    OuterClass1.InnerClass innerClass = new OuterClass1.InnerClass();
    innerClass.execute();;
    }
}
