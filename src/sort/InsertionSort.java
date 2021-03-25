package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 5, 6, 3 };
        print(insertionSort(arr));
    }

    public static int[] insertionSort(int arr[]) {
        return arr;
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
