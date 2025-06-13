package Generics.Basics;

import java.util.Objects;

 class LaptopRecord{
    Laptop[] items;
    LaptopRecord() {
        this.items = new Laptop[10];
    }
    public void addLaptop(Laptop laptop) {
        for (int i = 0; i < this.items.length; i++) {
            if (Objects.isNull(this.items[i])) {
                this.items[i] = laptop;
                return;
            }
        }
    }
    public Laptop getLaptop(int index) {
        if (index < this.items.length) {
            return items[index];
        }
        else return null;
    }
}
