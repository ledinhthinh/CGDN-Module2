package case_study.controllers;

import case_study.commons.FileUtils;
import case_study.models.Employee;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static void SearchEmployee() {
        Stack<Employee> employeeStack = new Stack<>();
        List<String[]> listEmployee = FileUtils.readFile("src/case_study/data/Employee.csv");
        for (String[] c : listEmployee) {
            Employee employee = new Employee(c[0], c[1], c[2]);
            employeeStack.push(employee);
        }
        String search = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("LIST NAME EMPLOYEE.");
        for (Employee p : employeeStack) {
            System.out.println(p.getNameEmployee());
        }
        System.out.println("Enter the employee you want to search: ");
        search = scanner.nextLine();
        boolean check = false;
        for (Employee p : employeeStack) {
            if (search.equals(p.getNameEmployee())) {
                System.out.println("Name: " + p.getNameEmployee() + " Age: " + p.getAgeEmployee() + " Address: " + p.getAddressEmployee());
//              System.out.println(employeeStack.push(p));
                check =true;
                break;
            }
        }
        if (!check)   {
            System.out.println("There is no such employee in the filing cabinet.");
        }

    }
}


