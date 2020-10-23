package _3_array_and_method.bai_tap;

public class MaxMangHaiChieu {
    public static int maxValue(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 5, 3, 6, 7, 8}, {4, 7, 8, 3, 9, 1}};
        int max = maxValue(arr);
        System.out.println("The smallest element in the array is: " + max);
    }
}


