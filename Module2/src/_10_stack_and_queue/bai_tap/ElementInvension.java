package _10_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class ElementInvension<E> {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
