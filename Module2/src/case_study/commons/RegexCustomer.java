package case_study.commons;

import java.util.regex.Pattern;

public class RegexCustomer {
    public static boolean regexNameCus(String str){
        String regex = "([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]" +
                "([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)[ ])+" +
                "[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]" +
                "([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)";
        return Pattern.matches(regex,str);
    }
    public static boolean regexEmail(String str){
        String regex ="^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$";
        return Pattern.matches(regex,str);
    }
    public static boolean regexBirth(String str){
        String regex = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]" +
                "(0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}" +
                "|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$";
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
    public static boolean regexKindOfCus(String str){
        String regex = "(Diamond|Gold|Silver|Copper)";
        return Pattern.matches(regex,str);
    }
    public static boolean regexAddress(String str){
        String regex = "^([\\w]{1,16})([ ]{0,1})([\\w]{1,16})?([ ]{0,1})?([\\w]{0,16})?([ ]{0,1})?-([\\w]{1,16})" +
                "([ ]{0,1})([\\w]{1,16})?([ ]{0,1})?([\\w]{1,16})?([ ]{0,1})?-([A-Za-z]{1,16})([ ]{0,1})" +
                "([A-Za-z]{1,16})?([ ]{0,1})?([A-Za-z]{1,16})?([ ]{0,1})?";
        return Pattern.matches(regex,str);
    }
    public static boolean regexServiceObject(String str){
        String regex = "(Villa|House|Room)";
        return Pattern.matches(regex,str);
    }

}
