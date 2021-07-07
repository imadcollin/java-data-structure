package sort;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = shellSort(new int[] { 1, 2, 4, 5, 7, 3 });
        print(arr);
    }

    public static int[] shellSort(int arr[]) {
        int n = arr.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval) {

                    arr[j] = arr[j - interval];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
