package _3_array_and_method.bai_tap;

import java.util.Scanner;

public class InsertElement {
    public static void Insert(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan tu muon chen: ");
        int x = scanner.nextInt();
        System.out.print("Nhap vi tri muon chen: ");
        int index = scanner.nextInt();
        if (index <= 1 && index >= array.length - 1) {
            System.out.print("Khong chen duoc phan tu vao mang!!!");
        } else {
            for (int i = array.length-1; i > index - 1; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ",");
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Insert(arr);
    }
}
