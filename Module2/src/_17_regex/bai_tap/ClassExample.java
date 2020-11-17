package _17_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public ClassExample(){
        pattern = Pattern.compile(REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
