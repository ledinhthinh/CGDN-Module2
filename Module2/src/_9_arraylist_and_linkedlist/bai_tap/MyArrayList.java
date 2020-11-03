package _9_arraylist_and_linkedlist.bai_tap;

import java.util.ArrayList;

public class MyArrayList<String> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList(int capacity) {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int i,String E) {
        elements[i++] = E;
    }
    public Object remove(int index){
        Object oldValue = elements[index];
        for (int i = index;i<elements.length;i++){
            elements[i] =elements[i++];
        }
        return oldValue;
    }


}
