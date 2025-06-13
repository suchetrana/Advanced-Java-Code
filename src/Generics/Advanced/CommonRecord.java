package Generics.Advanced;

import java.util.Objects;

class CommonRecord<E> { // "E" is any datatype
     private E[] items;
     public CommonRecord() {
         this.items = (E[]) new Object[10];
     }
     public void addItem(E item) {
         for (int i = 0; i < this.items.length; i++) {
             if (Objects.isNull(this.items[i])) {
                 this.items[i] = item;
                 break;
             }
         }
     }
     public E getItems(int index) {
         return items[index];
     }
}

