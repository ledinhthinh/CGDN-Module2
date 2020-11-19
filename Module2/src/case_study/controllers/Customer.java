package case_study.controllers;

import case_study.models.Customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    List<Customers> customersList = new ArrayList<>();
    public void addNewCustomer(){
        Customers customers = new Customers();
        System.out.println("Enter name: ");
        customers.setName(scanner.nextLine());
        System.out.println("Enter day of birth: ");
        customers.setBirth(scanner.nextLine());
        System.out.println("Enter gender: ");
        customers.setGender(scanner.nextLine());
        System.out.println("Enter ID number: ");
        customers.setNumId(scanner.nextLine());
        System.out.println("Enter phone: ");
        customers.setPhone(scanner.nextLine());
        System.out.println("Enter email: ");
        customers.setEmail(scanner.nextLine());
        System.out.println("Enter kind of customer: ");
        customers.setKindCustomer(scanner.nextLine());
        System.out.println("Enter address: ");
        customers.setAddress(scanner.nextLine());
        System.out.println("service: 1.Villa 2.House 3.Room");
        System.out.println("Inviting you to choose");
        customers.setServiceObject(scanner.nextLine());
        customersList.add(customers);

    }
}
