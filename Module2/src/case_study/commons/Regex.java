package case_study.commons;

import java.util.regex.Pattern;

public class Regex {
    public static boolean checkIdService(String str){
        String regex = "^(SV)(VL|HO|RO)-[\\d]{4}$";
        return Pattern.matches(regex,str);
    }
}
