package _5_access_modifier.bai_tap;
import _5_access_modifier.bai_tap.Circle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();
        Circle circle = new Circle("red", r);
        System.out.println(circle.getArea() + " and " + circle.getRadius());
    }

}
