package sort;

public class CombSort {
    public static void main(String[] args) {
        combSort(new int[] { 1, 2, 5, 3, 6 });
    }

    // GeegsOfGeeks
    public static void combSort(int arr[]) {
        int gab = arr.length;
        int n = arr.length;
        boolean swap = true;
        while (gab != 1 || swap == true) {
            gab = getGap(gab);
            swap = false;

            for (int i = 0; i < n - gab; i++) {
                if (arr[i] > arr[gab + i]) {
                    int temp = arr[i];
                    arr[i] = arr[gab + i];
                    arr[gab + i] = temp;
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
}
