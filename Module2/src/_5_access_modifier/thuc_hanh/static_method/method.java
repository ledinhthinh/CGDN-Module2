package _5_access_modifier.thuc_hanh.static_method;

public class method {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        //constructor to initialize the variable
        method(int r, String n) {
            rollno = r;
            name = n;
        }

        //static method to change the value of static variable
        static void change() {
            college = "CODEGYM";
        }

        //method to display values
        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }

        public static void main(String args[]) {
            method.change(); //calling change method

            //creating objects
            method s1 = new method(111, "Hoang");
            method s2 = new method(222, "Khanh");
            method s3 = new method(333, "Nam");

            //calling display method
            s1.display();
            s2.display();
            s3.display();
        }
    }

