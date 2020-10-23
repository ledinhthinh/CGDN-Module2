package _2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        boolean checks = true;
        if (number < 2) {
            System.out.print(number + " is not a prime!");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    checks = false;
                    break;
                }
            }
            if (checks) {
                System.out.println(number + " is a prime!");
            } else {
                System.out.println(number + " is not a prime!");
            }
        }
    }
}

