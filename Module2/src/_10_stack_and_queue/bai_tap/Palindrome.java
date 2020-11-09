package _10_stack_and_queue.bai_tap;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String string = "Able was I ere I saw Elba";
        char[] arr = string.toCharArray();
        boolean check = false;
        for (char c : arr) {
            stack.push(c);
        }
        for (int i = 0; i < stack.size(); i++) {
            for (int j = stack.size(); j >= 0; j--) {
                if (stack.get(i) == stack.get(j)) {
                    check = true;
                }
            }
        }
        if (check) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
