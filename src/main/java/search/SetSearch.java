package search;

import java.util.HashSet;
import java.util.Set;

public class SetSearch {
    public static void main(String[] args) {
        int value = find(2);
        print(value);
    }

    public static int find(int key) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        return set.contains(key) ? key : -1;
    }

    public static void print(int value) {
        if (value == -1)
            System.out.println("The element not found ...!");
        else
            System.out.println(value + " Exit");
    }

}
