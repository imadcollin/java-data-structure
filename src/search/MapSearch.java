package search;

import java.util.HashMap;
import java.util.Map;

public class MapSearch {
    public static void main(String[] args) {
        String value = find(2);
        System.out.println(value);
    }

    public static String find(int key) {
        Map<Integer, String> integers = new HashMap<>();
        integers.put(1, "first");
        integers.put(2, "second");
        integers.put(3, "third");
        integers.put(4, "fourth");
        return integers.get(key);
    }
}
