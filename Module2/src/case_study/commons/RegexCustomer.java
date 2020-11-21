package case_study.commons;

import java.util.regex.Pattern;

public class RegexCustomer {
    public static boolean regexNameCus(String str){
        String regex = "([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)[ ])+[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)";
        return Pattern.matches(regex,str);
    }
    public static boolean regexEmail(String str){
        String regex ="^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$";
        return Pattern.matches(regex,str);
    }
    public static boolean regexBirth(String str){
        String regex = "\\d{1,2}-\\d{1,2}-\\d{4}";
        return Pattern.matches(regex,str);
    }
    public static boolean regexGender(String str){
        String regex= "(Male|Female|Unknow)";
        return Pattern.matches(regex,str);
    }
    public static boolean regexId(String str){
        String regex = "^\\d{9}$";
        return Pattern.matches(regex,str);
    }
    public static boolean regexPhone(String str){
        String regex = "^0[1-9]{1}[0-9]{8}$";
        return Pattern.matches(regex,str);
    }
}
