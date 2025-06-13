package Generics;

 class Book {
    private int id;
    private String name;
    public Book(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Book(int id) {
        super();
        this.id = id;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + "]";
    }
}
