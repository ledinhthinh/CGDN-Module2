package _17_regex.bai_tap;

import _17_regex.bai_tap.ClassExample;

public class ClassTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[]{"C0920G","A0919M","P0920L"};
    public static final String[] invalidClass = new String[]{"A098G","B0987G","C0920O"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String nameClass : validClass) {
            boolean isvalid = classExample.validate(nameClass);
            System.out.println("Email is " + nameClass + " is valid: " + isvalid);
        }
        for (String nameClass : invalidClass) {
            boolean isvalid = classExample.validate(nameClass);
            System.out.println("Email is " + nameClass + " is valid: " + isvalid);
        }
    }
}
