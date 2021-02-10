package arrays;

public class SecondLarger {
    public static void main(String[] args) {
        int value = findSecondLarger(new int[] { 1, 4, 5, 7, 3, 44, 55 });
        System.out.println(value);
    }

    private static int findSecondLarger(int[] arr) {
        Integer high = Integer.MIN_VALUE, higher = Integer.MIN_VALUE;
        for (int i : arr) {

            if (high < i) {
                high = higher;
                higher = i;
            }

        }
        return high;
    }
}
