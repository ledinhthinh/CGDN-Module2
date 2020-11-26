package my_case_study;

import case_study.commons.RegexService;
import case_study.controllers.*;

import java.util.Scanner;

public class Main {
    static void mainController() throws Exception {
        Scanner scanner=new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("--------MENU--------");
            System.out.println("1.Add New Phone Book.");
            System.out.println("2.Show Phone Book.");
            System.out.println("3.Edit Phone Book.");
            System.out.println("4.Delete Phone Book.");
            System.out.println("5.Search Phone Book.");
            System.out.println("0.Exit.");
            System.out.println("Please enter your selection.");
            String numStr = scanner.nextLine();
            while (!RegexService.checkNum(numStr)){
                System.out.println("Enter incorrect data, please re-enter !!!");
                numStr=scanner.nextLine();
            }
            int num = Integer.parseInt(numStr);
            boolean isNumber = true;
            if (num < 0 || num > 5) {
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
                    PhoneBook.addnewPhoneBook();
                    break;
                }
                case 2: {
                    PhoneBook.showPhoneBook();
                    break;
                }
                case 3: {
                    PhoneBook.editPhoneBook();
                    break;
                }
                case 4: {
                    PhoneBook.deletePhoneBook();
                    break;
                }
                case 5: {
                    PhoneBook.searchPhoneBook();
                    break;
                }
                case 0:
                    check = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        mainController();
    }
}
