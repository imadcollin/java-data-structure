package arrays;

import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {

        int index = find(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
        print(3, index);
    }

    /**
     * template <typename T> int exponential_search(T arr[], int size, T key) { if
     * (size == 0) { return NOT_FOUND; }
     * 
     * int bound = 1; while (bound < size && arr[bound] < key) { bound *= 2; }
     * 
     * return binary_search(arr, key, bound/2, min(bound + 1, size)); }
     */
    public static int find(int arr[], int search) {
        if (search == arr[0]) {
            return arr[0];
        }
        if (search == arr.length - 1) {
            return arr.length;
        }
        if (arr.length == 0)
            System.out.println("not found");
        int bound = 1;
        while (bound < arr.length && arr[bound] <= search) {
            bound *= 2;
        }
        return Arrays.binarySearch(arr, bound / 2, Math.min(bound, arr.length), search);
    }

    public static void print(int element, int index) {
        if (index == -1)
            System.out.println("The element not found ...!");
        else
            System.out.println("The element:" + element + " is in Index [" + index + "]");
    }

}
