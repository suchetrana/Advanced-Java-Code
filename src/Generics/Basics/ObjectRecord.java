package Generics;

import java.util.Objects;

public class ObjectRecord {
    Object[] items;
    ObjectRecord() {
        this.items = new Object[10];
    }
    public void addItem(Object object) {
        for (int i = 0; i < this.items.length; i++) {
            if (Objects.isNull(this.items[i])) {
                this.items[i] = object;
                return;
            }
        }
    }
    public Object getItem(int index) {
        if (index < this.items.length) {
            return items[index];
        }
        else return null;
    }
}
