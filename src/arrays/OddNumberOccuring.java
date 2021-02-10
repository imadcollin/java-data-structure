package arrays;

public class OddNumberOccuring {
    public static void main(String[] args) {
        int value = findOddOccuring(new int[] { 1, 2, 1, 2, 3, 4, 4 });
        System.out.println(value);

        int value2 = findOddOccuring2(new int[] { 1, 2, 1, 2, 3, 4, 4 });
        System.out.println(value2);

    }

    private static int findOddOccuring(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }
        return result;
    }

    private static int findOddOccuring2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int twice = 0;
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    twice++;
                }
            }
            if (twice != 2) {
                return temp;
            }
        }
        return 0;
    }

}
