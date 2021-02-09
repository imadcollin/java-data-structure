package search;

import java.util.ArrayList;
import java.util.List;

public class LisfSearch {
    public static void main(String[] args) {
        int index = find(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 4);
        System.out.println(index);
    }

    public static int find(int arr[], int key) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list.indexOf(key);

    }
}
