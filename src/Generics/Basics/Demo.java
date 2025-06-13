package Generics.Basics;

class Demo {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Basic");
        Book book2 = new Book(2, "Java Advanced");
        Laptop laptop1 = new Laptop(1, "HP");
        Laptop laptop2 = new Laptop(2, "DELL");

//        BookRecord bookRecord = new BookRecord();
//        bookRecord.addBook(book1);
//        bookRecord.addBook(book2);
//        Book book = bookRecord.getBook(1);
//        System.out.println(book);
//
//        LaptopRecord laptopRecord = new LaptopRecord();
//        laptopRecord.addLaptop(laptop1);
//        laptopRecord.addLaptop(laptop2);
//        Laptop laptop = laptopRecord.getLaptop(0);
//        System.out.println(laptop);

        ObjectRecord objectRecord = new ObjectRecord();
        objectRecord.addItem(book1);
        objectRecord.addItem(laptop1);
        Book book = (Book) objectRecord.getItem(0);
        Laptop laptop = (Laptop) objectRecord.getItem(1); //(laptop) is typecasting
//        Book book = (Book) objectRecord.getItem(1); //if we run here ClassCastException occur because you convert laptop object to book object
//        System.out.println(book);
        System.out.println(book+"\n"+laptop);


    }
}
