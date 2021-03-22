package sort;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = shellSort(new int[] { 1, 2, 4, 5, 7, 3 });
        print(arr);
    }

    public static int[] shellSort(int arr[]) {
        return arr;
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
