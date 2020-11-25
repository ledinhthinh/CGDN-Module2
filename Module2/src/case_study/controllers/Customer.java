package case_study.controllers;

import case_study.commons.CompaName;
import case_study.commons.FileUtils;
import case_study.commons.RegexCustomer;
import case_study.models.Customers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Customer extends RegexCustomer {
    static Scanner scanner = new Scanner(System.in);
    static List<Customers> customersList = new ArrayList<>();

    public static void addNewCustomer() {
        Customers customers = new Customers();
        System.out.println("Enter name: ");
        customers.setName(scanner.nextLine());
        while (!regexNameCus(customers.getName())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setName(scanner.nextLine());
        }
        System.out.println("Enter day of birth: ");
        customers.setBirth(scanner.nextLine());
        while (!regexBirth(customers.getBirth())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setBirth(scanner.nextLine());
        }
        System.out.println("Enter gender(Male or Fimale or Unknow): ");
        customers.setGender(scanner.nextLine());
        while (!regexGender(customers.getGender())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setGender(scanner.nextLine());
        }
        System.out.println("Enter ID number: ");
        customers.setNumId(scanner.nextLine());
        while (!regexId(customers.getNumId())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setNumId(scanner.nextLine());
        }
        System.out.println("Enter phone: ");
        customers.setPhone(scanner.nextLine());
        while (!regexPhone(customers.getPhone())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setPhone(scanner.nextLine());
        }
        System.out.println("Enter email: ");
        customers.setEmail(scanner.nextLine());
        while (!regexEmail(customers.getEmail())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setEmail(scanner.nextLine());
        }
        System.out.println("Enter kind of customer( Diamond|Gold|Silver|Copper ): ");
        customers.setKindCustomer(scanner.nextLine());
        while (!regexKindOfCus(customers.getKindCustomer())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setKindCustomer(scanner.nextLine());
        }
        System.out.println("Enter address(commune (ward)-district (district)-province (city)): ");
        customers.setAddress(scanner.nextLine());
        while (!regexAddress(customers.getAddress())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            customers.setAddress(scanner.nextLine());
        }
//        System.out.println("Enter service Object(Villa|House|Room):");
//        customers.setServiceObject(scanner.nextLine());
//        while (!regexServiceObject(customers.getServiceObject())) {
//            System.out.println("Enter incorrect data, please re-enter !!!");
//            customers.setServiceObject(scanner.nextLine());
//        }
        customersList.add(customers);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/Customer.csv"), true));
            for (Customers line : customersList) {
                bufferedWriter.write(line.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Successfully entered !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showInformationOfCustomer() {
        List<Customers> list = new ArrayList<>();
        List<String[]> list1 = FileUtils.readFile("src/case_study/data/Customer.csv");
        for (String[] c : list1) {
            Customers customers = new Customers(c[0], c[1], c[2], c[3], c[4], c[5], c[6], c[7]);
            list.add(customers);
        }
        sort(list, new CompaName());
        System.out.println("--------LIST CUSTOMER--------");
        for (Customers c : list) {
            System.out.println("Name: " + c.getName() + " ID: " + c.getNumId() + " Birthday: " + c.getBirth() + " Gender: " + c.getGender() + " Phone: " + c.getPhone()
                    + " Email: " + c.getEmail() + " Address: " + c.getAddress() + " Kind customer: " + c.getKindCustomer());
//            c.showInFor();
        }
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/Customer.csv")));
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null && !line.equals("")){
//            String[] elementLine = line.split(",");
//            list.add(elementLine);
//        }
//        bufferedReader.close();
//        System.out.println(list);
    }
}
