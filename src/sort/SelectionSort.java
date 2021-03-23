package sort;

class SelectionSort {
    public static void main(String[] args) {
        print(selectionSort(new int[] { 1, 3, 4, 2, 6, 5 }));

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
                int temp = arr[i];
                arr[i] = arr[min];

                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
