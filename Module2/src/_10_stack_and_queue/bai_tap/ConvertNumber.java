package _10_stack_and_queue.bai_tap;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.Stack;

public class ConvertNumber {
    private static final char CHAR_55 = 55 ;

    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<>();
        while (num!=0){
            int temp = num %2;
            stack.push(temp);
            num /=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    public void convertSixteen(int numb){
        Stack<Object> sta = new Stack<>();
        while (numb > 0){
            int temp = numb % 16;
            if (temp>=10){
                sta.push((char) (CHAR_55+ temp));
            }
            else sta.push(temp);
            numb /= 16;
        }
        while (!sta.isEmpty()){
            System.out.print(sta.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("He thap phan: ");
        int decimalNumber = scanner.nextInt();
        System.out.println("He nhi phan: ");
        new ConvertNumber().convertBinary(decimalNumber);
        System.out.println("\nHe 16: ");
        new ConvertNumber().convertSixteen(decimalNumber);
    }
}
