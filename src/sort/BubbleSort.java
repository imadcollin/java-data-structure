package sort;
public class BubbleSort {
    public static void main(String[] args) {
        sort(new int[] { 1, 3, 2, 4, 6, 7, 8, 5 });
    }

    public static void sort(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
