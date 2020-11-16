package _14_exception_and_debug.bai_tap;

import java.util.Scanner;

public class Triangle extends IllegalTriangleException {
    public Triangle(String isErrorMessenger) {
        super(isErrorMessenger);
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("Nhap vao ba canh cua tam giac: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        try {
          TriangleException(a,b,c);
            System.out.println("ok");
        } catch ( IllegalTriangleException e) {
            System.out.println(e.getErrorMessenger());
        }
    }
}
