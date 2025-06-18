package Collections.ComparatorAndComparable;

class Employee implements Comparable<Employee>{
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

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
