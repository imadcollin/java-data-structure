package arrays;

public class OddNumberOccuring {
    public static void main(String[] args) {
        int value = findOddOccuring(new int[] { 1, 2, 1, 2, 3, 4, 4 });
        System.out.println(value);
    }

    private static int findOddOccuring(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }
        return result;
    }
}
