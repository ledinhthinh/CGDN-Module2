package _10_stack_and_queue.thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<Object> {
    private LinkedList<Object> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(Object element){
        stack.addFirst(element);
    }
    public Object pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public int size(){
        return stack.size();
    }
}
