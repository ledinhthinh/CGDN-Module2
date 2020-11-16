package _13_sorting_algorithms.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 3, 2, 9, 10, 15, 1};
        insertionSort(arr);
    }
}
