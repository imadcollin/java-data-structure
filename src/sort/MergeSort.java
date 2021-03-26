package sort;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 7, 5 };
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static int[] merge(int arr[], int p, int q, int r) {
        int size1 = q - p + 1;
        int size2 = r - q;
        int L[] = new int[size1];
        int M[] = new int[size2];
        for (int i = 0; i < L.length; i++) {
            L[i] = arr[p + i];
        }
        for (int i = 0; i < M.length; i++) {
            M[i] = arr[q + 1 + i];
        }

        int i = 0, j = 0, k = p;
        while (i < size1 && j < size2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < size2) {
            arr[k] = M[j];
            j++;
            k++;

        }
        return arr;
    }

    public static int[] mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
