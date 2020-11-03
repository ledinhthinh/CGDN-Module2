package _9_arraylist_and_linkedlist.thuc_hanh.list_don_gian;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element,size);
    }
    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }
    public E get(int i){
        if (size <= i || i<0){
            throw new IndexOutOfBoundsException("Index: "+i+" Size: "+size);
        }
        return (E) element[i];
    }
}
