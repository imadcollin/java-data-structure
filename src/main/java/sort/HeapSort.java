package sort;

public class HeapSort {
    public static void main(String[] args) {
        heapSort(new int[] { 1, 2, 4, 9, 3, 6 });
    }

    public static void heapSort(int arr[]) {
        System.out.println("------Before sorting------");
        print(arr);
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapfy(arr, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapfy(arr, i);

        }
        System.out.println("------After sorting------");
        print(arr);
    }

    public static void heapfy(int arr[], int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < arr.length && arr[left] > arr[largest])
            largest = left;
        if (right < arr.length && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapfy(arr, largest);
        }

    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
