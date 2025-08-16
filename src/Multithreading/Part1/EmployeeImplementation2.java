package Multithreading.Part1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImplementation2 implements EmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee(201, "Abhishek"));
        employeeList.add(new Employee(202, "Sneh"));
        employeeList.add(new Employee (203, "Lakshay"));
        employeeList.add(new Employee (204, "Aditi"));
        employeeList.add(new Employee (205, "Raman"));
}
    @Override
    public void displayEmployees(){
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
