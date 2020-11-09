package _11_tree_map.thuc_hanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nam",20,"HN");
        Student student2 = new Student("Hung",21,"HN");
        Student student3 = new Student("Anh",22,"HN");
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);
        for (Map.Entry<Integer,Student> student : map.entrySet()){
            System.out.println(map.toString());
        }
        System.out.println("....................Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student: students){
            System.out.println(student.toString());
        }
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
