package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6 }; // 5 is missing.

        System.out.println(missingNumber(arr));
        System.out.println(missingNumberForLoop(arr));

        int arr2[] = { 1, 3 }; // 2 is missing
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumberForLoop(arr2));
    }

    public static int missingNumber(int arr[]) {
        /**
         * n= n(n+1)/2 Missing NUmber = ArraySum- sum
         */
        int sum = 0;
        int n = arr.length + 1;
        int ArraySum = n * (n + 1) / 2;
        for (int i : arr) {
            sum += i;
        }
        return ArraySum - sum;
    }

    public static int missingNumberForLoop(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int prev = arr[i] + 1;
            if (prev != arr[i + 1])
                return prev;
        }
        return 0;
    }
}
