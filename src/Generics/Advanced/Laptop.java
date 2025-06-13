package Generics.Advanced;

class Laptop {
    private int id;
    private String name;
    Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "id: [" + id + "] Company: " + name;
    }
}
