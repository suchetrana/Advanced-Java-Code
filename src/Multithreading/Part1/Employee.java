package Multithreading.Part1;

public class Employee extends Multithreading.Part2.Employee {
    private int id;
    private String name;
    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

