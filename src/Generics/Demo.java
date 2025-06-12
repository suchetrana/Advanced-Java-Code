package Generics;

public class Demo {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Basic");
        Book book2 = new Book(2, "Java Advanced");
        BookRecord bookRecord = new BookRecord();
        bookRecord.addBook(book1);
        bookRecord.addBook(book2);
        Book book = bookRecord.getBook(1);
        System.out.println(book);

    }
}
