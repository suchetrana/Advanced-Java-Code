package Generics.Basics;

 class Laptop {
    private int id;
    private String name;
    public Laptop(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Laptop [id=" + id + ", name = " + name + "]";
    }
}
