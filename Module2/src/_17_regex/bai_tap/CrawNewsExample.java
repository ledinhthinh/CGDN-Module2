package _17_regex.bai_tap;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("news\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
