package _4_OOP.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public static class Quadratic {
        double a, b, c;

        public Quadratic() {
        }

        public Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return ((Math.pow(b,2)) - (4 * a * c));
        }

        public String display() {
            return ("a= " + a + "\nb= " + b + "\nc= " + c+"\n");
        }

        public double bigger1() {
            return ((-b - Math.sqrt(getDiscriminant())) / 2 * a);
        }

        public double bigger2() {
            return ((-b + Math.sqrt(getDiscriminant())) / 2 * a);
        }

        public double equal() {
            return (-b / 2 * a);
        }

        public String less() {
            return ("The equation has no roots");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        Quadratic quadratic = new Quadratic(a, b, c);
        System.out.print(quadratic.display());
        if (quadratic.getDiscriminant() > 0) {
            System.out.print("Phương trình có 2 nghiệm: " + "N1= " + quadratic.bigger1() + "N2= " + quadratic.bigger2());
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.print("Phương trình có 1 nghiệm: " + quadratic.equal());
        } else System.out.println(quadratic.less());

    }
}
