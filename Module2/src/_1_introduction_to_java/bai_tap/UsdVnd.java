package _1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UsdVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println("VND: "+vnd);

    }
}
