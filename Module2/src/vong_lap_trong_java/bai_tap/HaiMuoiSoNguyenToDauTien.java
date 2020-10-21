package vong_lap_trong_java.bai_tap;

public class HaiMuoiSoNguyenToDauTien {
    public static boolean ktsnt(int number) {
//        if (number < 2) {
//            return false;
//        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
   // }

    public static void main(String[] args) {
        int num = 2;
        int dem = 0;
        while (dem < 20) {
            if (ktsnt(num)) {
                System.out.print(num+",");
                dem++;
            }
            num++;
        }

    }
}
