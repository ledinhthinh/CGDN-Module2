package _3_array_and_method.thuc_hanh;

public class GiaTriNhoNhat {
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
        int []arr = {4, 11, 7, 8, 17, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " +min);
    }
}
