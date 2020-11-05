package _10_stack_and_queue.bai_tap;

import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        String string = "Hello Hello Code Gym Da Da Da Nang";
        String[] str = string.split("\\s");
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (String s : str) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else map.put(s, 1);
        }
        System.out.println(map);
    }
}

