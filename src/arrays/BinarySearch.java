package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int index = find(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5);
        print(5, index);
    }

    public static int find(int arr[], int key) {
        return Arrays.binarySearch(arr, key);
    }

    public static void print(int element, int index) {
        if (index == -1)
            System.out.println("The element not found ...!");
        else
            System.out.println("The element:" + element + " is in Index [" + index + "]");
    }
}
