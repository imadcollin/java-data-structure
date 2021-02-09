package search;

public class SearchArray {
    public static void main(String[] args) {

        int index = search(new int[] { 1, 2, 3, 4, 9, 12, 5, 6, 7 }, 7);
        print(5, index);

        int index2 = binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 12, 15, 22 }, 6);
        print(6, index2);
    }

    public static int binarySearch(int arr[], int num) {
        int low = 0, high = 0;
        low = arr[0];
        high = arr.length - 1;
        do {
            int mid = (high + low) / 2;

            if (arr[mid] == num) {
                return mid;
            }

            else if (arr[mid] < num) {
                low = mid + 1;

            } else if (arr[mid] > num) {
                high = mid - 1;
            }

        } while (high >= low);
        return -1;
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

    public static void print(int element, int index) {
        if (index == -1) {
            System.out.println("Element not found ...!");
        } else
            System.out.println(element + "  Index is:[" + index + "]");

    }
}
