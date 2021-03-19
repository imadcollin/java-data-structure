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

    public static void heapfy(int arr[], int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (arr[left] > arr[largest])
            largest = left;
        if (arr[left] < arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }
        heapfy(arr, i);

    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
