package Generics.Advanced;
// Generics not allowing inheritance
// Generics comes in JAVA 5
// In Generics you cannot give Primitive Datatype so Wrapper Class Comes
class Demo {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Advanced");
        Book book2 = new Book(2, "Java Core Advanced");
        Laptop laptop1 = new Laptop(1, "HP");
        Laptop laptop2 = new Laptop(2, "DELL");

        CommonRecord<Book> bookRecord = new CommonRecord<Book>();
        bookRecord.addItem(book1);
        bookRecord.addItem(book2);
        Book book = bookRecord.getItems(0);
        System.out.println(book);

        CommonRecord<Laptop> laptopRecord = new CommonRecord<>(); // JAVA 7 update write only in one side #Best Practice.
        laptopRecord.addItem(laptop1);
        laptopRecord.addItem(laptop2);
        Laptop laptop = laptopRecord.getItems(1);
        System.out.println(laptop);

//      CommonRecord<Object> bookRecord2 = new CommonRecord<Laptop>(); // Not allowed

    }

}
