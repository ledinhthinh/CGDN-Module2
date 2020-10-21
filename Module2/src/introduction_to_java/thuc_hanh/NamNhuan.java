package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Năm " + year + " là năm nhuận!");
        } else {
            System.out.println("Năm " + year + " không phải là năm nhuận!");
        }
    }
}
