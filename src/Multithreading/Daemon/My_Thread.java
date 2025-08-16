package Multithreading.Daemon;

public class My_Thread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println( "Cuurent thread name: " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
