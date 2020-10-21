package vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money: ");
        double money = scanner.nextDouble();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter interest: ");
        double interest = scanner.nextDouble();
        double total = 0;
        for (int i = 0;i<month;i++){
            total += money *(interest/100)/12 *month;
        }
        System.out.print("Total of interest: "+total);
    }
}
