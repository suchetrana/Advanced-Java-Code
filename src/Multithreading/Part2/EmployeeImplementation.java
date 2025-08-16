package Multithreading.Part2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImplementation implements EmployeeRepository {
    private static List<Multithreading.Part1.Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Multithreading.Part1.Employee(101, "Abhishek"));
        employeeList.add(new Multithreading.Part1.Employee(102, "Sneha"));
        employeeList.add(new Multithreading.Part1.Employee(103, "Lakshay"));
        employeeList.add(new Multithreading.Part1.Employee(104, "Aditi"));
        employeeList.add(new Multithreading.Part1.Employee(105, "Raman"));
}
    @Override
    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return "EmployeeImplementation";
    }
}
