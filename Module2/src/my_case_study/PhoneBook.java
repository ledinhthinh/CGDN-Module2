package my_case_study;

import case_study.models.Employee;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    public static void addnewPhoneBook() {
        List<PhoneBookApstract> list = new ArrayList<>();
        PhoneBookApstract phoneBook = new PhoneBookApstract();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        phoneBook.setPhone(scanner.nextLine());
        while (!MyRegex.regexPhone(phoneBook.getPhone())) {
            System.out.println("Phone number incorrect format, please re-enter!!!");
            phoneBook.setPhone(scanner.nextLine());
        }
        System.out.println("Enter group of contacts: ");
        phoneBook.setGroup(scanner.nextLine());
        System.out.println("Enter name: ");
        phoneBook.setFullName(scanner.nextLine());
        while (!MyRegex.regexName(phoneBook.getFullName())) {
            System.out.println("Name incorrect format, please re-enter!!!");
            phoneBook.setFullName(scanner.nextLine());
        }
        System.out.println("Enter gender (Male|Female|Unknow)");
        phoneBook.setGender(scanner.nextLine());
        while (!MyRegex.regexGender(phoneBook.getGender())) {
            System.out.println("Gender incorrect format, please re-enter!!!");
            phoneBook.setGender(scanner.nextLine());
        }
        System.out.println("Enter address: ");
        phoneBook.setAddress(scanner.nextLine());
        System.out.println("Enter day of birth: ");
        phoneBook.setDayOfBirth(scanner.nextLine());
        while (!MyRegex.regexDayOfBirth(phoneBook.getDayOfBirth())) {
            System.out.println("Day of birth incorrect format, please re-enter!!!");
            phoneBook.setDayOfBirth(scanner.nextLine());
        }
        System.out.println("Enter email: ");
        phoneBook.setEmail(scanner.nextLine());
        while (!MyRegex.regexEmail(phoneBook.getEmail())) {
            System.out.println("Day of birth incorrect format, please re-enter!!!");
            phoneBook.setEmail(scanner.nextLine());
        }
        list.add(phoneBook);
//        ReadAndWrite.writeFile("src/my_case_study/PhoneBook.csv",list.toString());
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/my_case_study/PhoneBook.csv"), true));
            for (PhoneBookApstract line : list) {
                writer.write(line.toString() + "\n");
            }
            writer.close();
            System.out.println("Successfully!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showPhoneBook() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/my_case_study/PhoneBook.csv")));
        String line = null;
        System.out.println("--------PHONE BOOK--------");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void editPhoneBook() {
        Scanner scanner = new Scanner(System.in);
        List<PhoneBookApstract> listPhoneBook = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile("src/my_case_study/PhoneBook.csv");
        for (String[] e : list) {
            PhoneBookApstract phoneBookApstract = new PhoneBookApstract(e[0], e[1], e[2], e[3], e[4], e[5], e[6]);
            listPhoneBook.add(phoneBookApstract);
        }
        String search = null;
        for (PhoneBookApstract c : listPhoneBook) {
            System.out.println(c.toString());
        }
        System.out.println("Enter the phone number you want to edit: ");
        search = scanner.nextLine();
        boolean check = false;
        for (PhoneBookApstract p : listPhoneBook) {
            if (search.equals(p.getPhone())) {
                System.out.println("Enter group of contacts: ");
                p.setGroup(scanner.nextLine());
                System.out.println("Enter name: ");
                p.setFullName(scanner.nextLine());
                while (!MyRegex.regexName(p.getFullName())) {
                    System.out.println("Name incorrect format, please re-enter!!!");
                    p.setFullName(scanner.nextLine());
                }
                System.out.println("Enter gender (Male|Female|Unknow)");
                p.setGender(scanner.nextLine());
                while (!MyRegex.regexGender(p.getGender())) {
                    System.out.println("Gender incorrect format, please re-enter!!!");
                    p.setGender(scanner.nextLine());
                }
                System.out.println("Enter address: ");
                p.setAddress(scanner.nextLine());
                System.out.println("Enter day of birth: ");
                p.setDayOfBirth(scanner.nextLine());
                while (!MyRegex.regexDayOfBirth(p.getDayOfBirth())) {
                    System.out.println("Day of birth incorrect format, please re-enter!!!");
                    p.setDayOfBirth(scanner.nextLine());
                }
                System.out.println("Enter email: ");
                p.setEmail(scanner.nextLine());
                while (!MyRegex.regexEmail(p.getEmail())) {
                    System.out.println("Day of birth incorrect format, please re-enter!!!");
                    p.setEmail(scanner.nextLine());
                }
//                for(PhoneBookApstract e:listPhoneBook){
//                    System.out.println(e);
//                }
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/my_case_study/PhoneBook.csv")));
                    for (PhoneBookApstract line : listPhoneBook) {
                        writer.write(line + "\n");
                    }
                    writer.close();
                    System.out.println("Successfully!!!");
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("No phone number in Phone Book.");
        }
    }

    public static void deletePhoneBook() throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<PhoneBookApstract> listDelete = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile("src/my_case_study/PhoneBook.csv");
        for (String[] e : list) {
            PhoneBookApstract phoneBookApstract = new PhoneBookApstract(e[0], e[1], e[2], e[3], e[4], e[5], e[6]);
            listDelete.add(phoneBookApstract);
        }
        String search = null;
        int numCheck;
        boolean check = false;
        for (PhoneBookApstract c : listDelete) {
            System.out.println(c.toString());
        }
        System.out.println("Enter the phone number you want to delete: ");
        search = scanner.nextLine();
        for (int i = 0; i < listDelete.size(); i++) {
            if (search.equals(listDelete.get(i).getPhone())) {
                System.out.println("Are you sure you want to delete it?" +
                        "(1.Yes 2.No)");
                numCheck = scanner.nextInt();
                switch (numCheck) {
                    case 1: {
                        listDelete.remove(listDelete.get(i));
                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/my_case_study/PhoneBook.csv")));
                            for (PhoneBookApstract line : listDelete) {
                                writer.write(line + "\n");
                            }
                            writer.close();
                            System.out.println("Successfully!!!");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                    case 2: {
                        Main.mainController();
                        break;
                    }
                }
                check = true;
            }
        }
        if (!check){
            System.out.println("No phone number in Phone Book.");
        }
    }
    public static void searchPhoneBook(){
        Scanner scanner = new Scanner(System.in);
        List<PhoneBookApstract> listSearch = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile("src/my_case_study/PhoneBook.csv");
        for (String[] e : list) {
            PhoneBookApstract phoneBookApstract = new PhoneBookApstract(e[0], e[1], e[2], e[3], e[4], e[5], e[6]);
            listSearch.add(phoneBookApstract);
        }
        String search = null;
        System.out.println("Enter phone number or name you want to search: ");
        search = scanner.nextLine();
        boolean check = false;
        for (PhoneBookApstract p:listSearch){
            if (search.equals(p.getPhone())||search.equals(p.getFullName())){
                System.out.println("Phone number: "+p.getPhone()+" Group: "+p.getGroup()+" Name: "+p.getFullName()
                        +" Gender: "+p.getGender()+" Address: "+p.getAddress()+" Day of birth: "+p.getDayOfBirth()
                        +" Email: "+p.getEmail());
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("No phone number in phone  book");
        }
    }
}

