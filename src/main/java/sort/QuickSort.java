package sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 6, 5 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static int partition(int arr[], int min, int max) {
        int pivot = arr[max];
        int i = min - 1;

        for (int j = min; j < max; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[max];
        arr[max] = temp;
        return (i + 1);

    }

    public static void quickSort(int arr[], int min, int max) {

        if (min < max) {

            int p = partition(arr, min, max);
            quickSort(arr, min, p - 1);
            quickSort(arr, p + 1, max);
        }

    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
