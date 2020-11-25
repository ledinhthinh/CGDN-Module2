package case_study.commons;


import java.util.regex.Pattern;

public class RegexService {
    public static boolean checkIdVilla(String str){
        String regex = "^(SVVL)-[\\d]{4}$";
        return Pattern.matches(regex,str);
    } public static boolean checkIdHouse(String str){
        String regex = "^(SVHO)-[\\d]{4}$";
        return Pattern.matches(regex,str);
    }
    public static boolean checkIdRoom(String str){
        String regex = "^(SVRO)-[\\d]{4}$";
        return Pattern.matches(regex,str);
    }
    public static boolean checkNameSevice(String str){
        String regex = "^[A-Z]{1}[a-z]+$";
        return Pattern.matches(regex,str);
    }
//    public static boolean checkDateOfBirth(String str){
//        String regex = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.](0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$";
//        return Pattern.matches(regex,str);
//    }
    public static boolean checkArea(String str){
        String regex = "^[3-9][0-9].?\\d*$";
        return Pattern.matches(regex,str);
    }
    public static boolean checkPayRent(String str){
        String regex = "^[\\d]+$";
        return Pattern.matches(regex,str);
    }
    public static boolean checkMaxPeople(String str){
        String regex = " ^[1-9]|0[1-9]|1[0-9]|2[0]$";
        return Pattern.matches(regex,str);
    }
    public static boolean checkFreeService(String str){
        String regex = "(massage)|(karaoke)|(food)|(drink)|(car)";
        return Pattern.matches(regex,str);
    }
    public static boolean checkNumberOfFloors(String str){
        String regex = "^[0-9]+$";
        return Pattern.matches(regex,str);
    }
    public static boolean checkNum(String str){
        String regex = "[0-9]{1}";
        return Pattern.matches(regex,str);
    }
}
