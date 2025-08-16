package Multithreading.Daemon;

public class Demo{
    public static void main(String[] args) {
        My_Thread myThread = new My_Thread();
        myThread.setDaemon(true);
        myThread.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread name: " + myThread.currentThread().getName());
    }
}
