package _10_stack_and_queue.bai_tap;

import java.util.Stack;

public class CheckTheBrackets {
    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * )s – c(";
        char[] arr = string.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : arr) {
            if (c == '(') {
                stack1.push(c);
            }
        }
        for (char c : arr) {
            if (c == ')') {
                stack2.push(c);
            }
        }
        boolean check1 = false;
        boolean check2;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == ')' && arr[i+1] == '(') {
                check1 = false;
                break;
            } else check1 = true;
        }
        check2 = stack1.size() == stack2.size();
        if (check1 && check2) {
            System.out.println("True");
        } else System.out.println("False");
    }
}