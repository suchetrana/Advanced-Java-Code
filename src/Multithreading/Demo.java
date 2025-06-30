package Multithreading;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"started fetching employees");
        EmployeeServiceImp employeeServiceImp = null;
        long startTime = System.currentTimeMillis();
        employeeServiceImp = new EmployeeServiceImp(new EmployeeImplementation());
        employeeServiceImp.run();
        employeeServiceImp = new EmployeeServiceImp(new EmployeeImplementation2());
        employeeServiceImp.run();
        System.out.println("Completed time: " + (System.currentTimeMillis()-startTime)+ " milliseconds");
        System.out.println(Thread.currentThread().getName()+" finshed fetching ");

    }
}
