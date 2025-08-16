package Multithreading.Basic;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Using_Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main started");
        long sTime = System.currentTimeMillis();
        Thread myThread = new MyThread();
        System.out.println("Started Time: " + (sTime-sTime));
        myThread.start();
        myThread.join();
        long eTime = System.currentTimeMillis();
        System.out.println("Ended Time: " + (eTime - sTime));
        System.out.println("main started");
    }
}

