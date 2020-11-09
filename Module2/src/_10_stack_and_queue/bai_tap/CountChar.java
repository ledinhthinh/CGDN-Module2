package _10_stack_and_queue.bai_tap;

import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        String string = "        Hello      Da Hello    Code     Gym       Da     Da    Da      Nang    ";
        while (string.contains("  ")) string = string.replaceAll("  "," ");
        String[] str = string.split("\\s");
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (int i =1;i<str.length;i++) {
            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i])+1);
                System.out.println(str[i]);
            } else map.put(str[i], 1);
        }
        System.out.println(map);
    }
}

