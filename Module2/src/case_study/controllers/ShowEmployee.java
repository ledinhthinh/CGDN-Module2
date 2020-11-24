package case_study.controllers;

import _16_in_out_binary_file.thuc_hanh.Main;
import case_study.commons.FileUntil;
import case_study.models.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ShowEmployee {
    private static Integer Id =0;
    public static void showInformationOfEmployee(){
        Map<String, Employee> employeeMap = new TreeMap<>();
        List<String[]> listEmployee = FileUntil.readFile("src/case_study/data/Employee.csv");
        System.out.println("--------EMPLOYEE--------");
            for (String[] c: listEmployee){
                Id++;
                Employee employee = new Employee(c[0],c[1],c[2]);
                employeeMap.put(String.format("%03d", Id),employee);
            }
        Set<String> set = employeeMap.keySet();
        for (String p:set){
            System.out.println(p+ ":"+employeeMap.get(p));
        }
        System.out.println("*****************************");
    }
}
