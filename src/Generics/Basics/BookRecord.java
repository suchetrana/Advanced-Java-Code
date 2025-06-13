package Generics.Basics;

import java.util.Objects;

 class BookRecord {
    Book[] items;
    BookRecord() {
        this.items = new Book[10];
    }
    public void addBook(Book book) {
        for (int i = 0; i < this.items.length; i++) {
            if (Objects.isNull(this.items[i])) {
                this.items[i] = book;
                return;
            }
        }
    }
    public Book getBook(int index) {
        if (index < this.items.length) {
        return items[index];
        }
        else return null;
    }


}
