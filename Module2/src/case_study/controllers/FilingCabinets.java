package case_study.controllers;

import case_study.commons.FileUntil;
import case_study.models.Employee;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static void SearchEmployee() {
        Stack<Employee> employeeStack = new Stack<>();
        List<String[]> listEmployee = FileUntil.readFile("src/case_study/data/Employee.csv");
        for (String[] c : listEmployee) {
            Employee employee = new Employee(c[0], c[1], c[2]);
            employeeStack.push(employee);
        }
        String search = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee you want to search: ");
        search = scanner.nextLine();
        for (Employee p : employeeStack) {
          if (search.equals(p.getNameEmployee())){
              System.out.println(employeeStack.push(p));
              break;
            }
        }

    }
}


