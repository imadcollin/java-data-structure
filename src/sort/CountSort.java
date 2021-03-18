package sort;

public class CountSort {
    public static void main(String[] args) {
        countSort(new int[] { 1, 3, 4, 2, 7, 5, 3, 2 });
    }

    public static void countSort(int arr[]) {

        int n = arr.length;
        int out[] = new int[n + 1];

        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            ++count[arr[i]];

        }
        for (int i = 1; i <= max; i++) {
            count[i] = count[i - 1] + count[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            out[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = out[i];
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int cumulative(int arr[], int element) {
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                times++;
        }
        return times;

    }
}
