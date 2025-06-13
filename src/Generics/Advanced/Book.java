package Generics.Advanced;

class Book {
    private int id;
    private String name;
    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "id: [" + id + "] name: " + name;
    }
}
