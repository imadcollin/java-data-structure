package arrays;

public class SearchArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 9, 12, 5, 6, 7 };

        // Search for 5 index
        int index = search(arr, 5);
        System.out.println(index);
    }

    public static int search(int arr[], int element) {
        int index = 0;
        for (int i : arr) {
            if (i == element) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
