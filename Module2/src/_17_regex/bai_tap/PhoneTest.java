package _17_regex.bai_tap;

public class PhoneTest {
    private static PhoneExample phoneExample;
    public static final String[] validPhone = new String[]{"84-0335290096"};
    public static final String[] invalidPhone = new String[]{"98-3352900966"};

    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String phone : validPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Email is " + phone + " is valid: " + isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Email is " + phone + " is valid: " + isvalid);
        }
    }
}
