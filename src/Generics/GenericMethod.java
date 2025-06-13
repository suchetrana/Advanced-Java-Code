package Generics;

class GenericMethod {
    public static void main(String[] args) {
        Book[] books = { new Book(1, "Java Basics"), new Book(2, "Java Advanced"), new Book(3, "Spring Basics") };
        Laptop[] laptops = { new Laptop(100, "HP"), new Laptop(200, "Dell"), new Laptop(300, "Apple") };

        Book bookToFind = new Book(2);
        Laptop laptopToFind = new Laptop(300);

        Book output = findBook(books, bookToFind);
        System.out.println(output);

        Laptop output2 = findLaptop(laptops, laptopToFind);
        System.out.println(output2);

        Book output3 = (Book) findObject(books, bookToFind);
        System.out.println(output3);

        Laptop output4 = (Laptop) findObject(laptops, laptopToFind);
        System.out.println(output4);

        Laptop output5 = (Laptop) findObject(laptops, bookToFind);
        System.out.println(output5);

        Book output6 = find(books, bookToFind);
        System.out.println(output6);

        Laptop output7 = find(laptops, laptopToFind);
        System.out.println(output7);

        // Laptop output8 = find(laptops, bookToFind); //Not allowed
        // System.out.println(output8);
    }

    public static Book findBook(Book[] repository, Book itemToFind) {
        for (Book item : repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }

    public static Laptop findLaptop(Laptop[] repository, Laptop itemToFind) {
        for (Laptop item : repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }

    public static Object findObject(Object[] repository, Object itemToFind) {
        for (Object item : repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }

    public static <E> E find(E[] repository, E itemToFind) {
        for (E item : repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }
}
