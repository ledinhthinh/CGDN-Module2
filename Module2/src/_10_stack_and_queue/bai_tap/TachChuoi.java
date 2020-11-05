package _10_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class TachChuoi {
    public static void main(String[] args) {
        String string = "Hello Code Gym Da Nang";
        String str = "";
        Stack<String> stack = new Stack<>();
        String[] mWord = string.split("\\s");
        for (int i = 0; i < mWord.length; i++) {
            stack.push(mWord[i]);
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = stack.pop();
        }
        for (int i =0;i<mWord.length;i++) {
            str += mWord[i]+" ";
        }
        System.out.println(string);
        System.out.println(str);

    }
}
