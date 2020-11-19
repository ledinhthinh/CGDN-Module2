package case_study.controllers;

import java.io.IOException;
import java.util.Scanner;

public class MainController extends Service{
    public static void displayMainMenu() throws IOException {
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
                  addNewService();
                    break;
                }
                case 2: {
                    showService();
                    break;
                }
                case 3: {
                    //addNewCustomer();
                    break;
                }
                case 4: {
                    //showInformationOfCustomer();
                    break;
                }
                case 5: {
                    //addNewBooking();
                    break;
                }
                case 6: {
                    //showInformationOfEmployee();
                    break;
                }
                case 0:
                    check = false;
            }

        }

    }



    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }
}


