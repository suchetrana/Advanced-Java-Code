package Multithreading.Part2;

import Multithreading.Part1.EmployeeImplementation;
import Multithreading.Part1.EmployeeImplementation2;
import Multithreading.Part1.EmployeeServiceImp;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"started fetching employees");
        EmployeeServiceImp employeeServiceImp = null;
        long startTime = System.currentTimeMillis();
        employeeServiceImp = new EmployeeServiceImp(new EmployeeImplementation());
        employeeServiceImp.start();
        employeeServiceImp = new EmployeeServiceImp(new EmployeeImplementation2());
        employeeServiceImp.start();
        System.out.println("Completed time: " + (System.currentTimeMillis()-startTime)+ " milliseconds");
        System.out.println(Thread.currentThread().getName()+" finshed fetching ");

    }
}
