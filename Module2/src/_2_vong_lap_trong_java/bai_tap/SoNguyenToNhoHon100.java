package _2_vong_lap_trong_java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static boolean ktsnt(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            if (ktsnt(num)) {
                System.out.print(num + ",");
            }
            num++;
        }

    }
}
