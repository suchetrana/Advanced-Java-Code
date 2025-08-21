package Inner_Classes;

class OuterClass2 {
    static int val = 5;
    String name = "OuterClass";
    class InnerClass2{
        public void execute(){
            System.out.println("Inside Inner Class !!!"+val);
        }
    }

}
public class NonStatic {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass2 innerClass2= outerClass2.new InnerClass2();

        OuterClass2.InnerClass2 innerClass= new OuterClass2().new InnerClass2();



    }
}
