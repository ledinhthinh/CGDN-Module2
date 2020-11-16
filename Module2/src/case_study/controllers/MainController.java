package case_study.controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1.Add new services.");
            System.out.println("2.Show services.");
            System.out.println("3.Add new customer.");
            System.out.println("4.Show information of customer.");
            System.out.println("5.Add new booking.");
            System.out.println("6.Show inofmation of employee.");
            System.out.println("0.Exit.");
            System.out.println("Please enter your selection.");
            int num = scanner.nextInt();
            boolean isNumber = true;
            if (num < 0 || num > 6) {
                System.out.println("Not a Number");
                isNumber = false;
//                break;
            }


            if (!isNumber) {
                System.out.println("You enter fail. Enter to enter a different number.");
                scanner.nextLine();
                continue;
            }
            switch (num) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 0:
                    check = false;
            }

        }

    }
}


