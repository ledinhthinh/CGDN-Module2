package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class pt_bac_1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextFloat();
        System.out.println("b: ");
        double b = scanner.nextFloat();
        System.out.println("c: ");
        double c = scanner.nextFloat();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = \n" + answer);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
