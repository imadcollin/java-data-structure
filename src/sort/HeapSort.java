package sort;

public class HeapSort {
    public static void main(String[] args) {
        heapSort(new int[] { 1, 2, 4, 6, 3, 6 });
    }

    public static void heapSort(int arr[]) {

        System.out.println("------Before sorting------");
        print(arr);
        System.out.println("------After sorting------");
        print(arr);
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
