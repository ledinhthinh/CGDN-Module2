package _13_sorting_algorithms.bai_tap;

import java.util.Arrays;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        int[] arr={4,5,8,3,2,9,10,15,1};
        for (int i = 1;i<arr.length;i++){
            System.out.println("Duyệt mảng từ phần tử thứ 2");
            int temp = arr[i];
            System.out.println("gán biến tạm bằng giá trị của vị trí thứ"+i);
            int j;
            System.out.println("khởi tạo biến j");
            for (j= i-1;j>=0;j--){
                System.out.println("duyệt phần j từ vị trí"+j+"đến vị trí đầu tiên");
                if (temp<arr[j]){
                    System.out.println("arr[i]="+temp+";arr[j]= "+arr[j]);
                    System.out.println("nếu arr[i] < arr[j] thì gán arr[j+1] = arr[j] thì gán arr[j+1] = arr[j]");
                    arr[j+1] = arr[j];
                }
                else
                {System.out.println("ngược lại thì thoát khỏi vòng lặp");
                break;}
            }
            System.out.println("gán lại arr[j+1] = temp");
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
