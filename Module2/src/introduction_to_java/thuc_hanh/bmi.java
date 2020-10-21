package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight!");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal!");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight!");
        } else if (bmi >= 30.0) {
            System.out.println("Obese!");
        }

    }
}
