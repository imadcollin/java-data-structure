package sort;

public class CombSort {
    public static void main(String[] args) {
        combSort(new int[] { 1, 2, 5, 3, 6 });
    }

    // GeegsOfGeeks
    public static void combSort(int arr[]) {
        int gap = arr.length;
        int n = arr.length;
        boolean swap = true;
        while (gap != 1 || swap == true) {
            gap = getGap(gap);
            swap = false;

            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[gap + i]) {
                    swap(arr, i, gap + i);
                    swap = true;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int getGap(int gab) {
        int gap = (gab * 10) / 13;
        if (gab < 1)
            return 1;
        return gap;
    }

    public static void swap(int arr[], int i, int y) {
        int temp = arr[i];
        arr[i] = arr[y];
        arr[y] = temp;

    }
}
