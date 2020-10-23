package _3_array_and_method.bai_tap;

import java.util.Scanner;

public class MinMang {
    public static int minValue(int [] array){
        int min = array[0];
        for (int i = 0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int index = scanner.nextInt();
        int [] arr = new int[index];
        for ( int i = 0;i<index;i++ ){
            System.out.print("Nhap phan tu "+i+" :");
            arr[i] = scanner.nextInt();
        }
        int min = minValue(arr);
        System.out.print("Gia tri nho nhat la: "+min);
    }
}