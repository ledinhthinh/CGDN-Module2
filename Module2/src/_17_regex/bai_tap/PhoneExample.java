package _17_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String REGEX = "^[0-9]{2}[-]{1}[0]{1}[0-9]{9}$";
    public PhoneExample(){
        pattern = Pattern.compile(REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
