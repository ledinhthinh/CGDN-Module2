package _3_array_and_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void Delete(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao x: ");
        int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,  3, 4, 1,1, 6, 7, 1, 9,1,11,12,13};
        Delete(arr);
    }
}
