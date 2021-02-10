package arrays;

public class SecondLarger {
    public static void main(String[] args) {
        int value = findSecondLarger(new int[] { 1, 4, 5, 7, 3, 44, 55 });
        System.out.println(value);
    }

    private static int findSecondLarger(int[] arr) {
        int lower = 0, higher = 0;
        for (int i : arr) {

            if (lower < i) {
                lower = higher;
                higher = i;
            }

        }
        return lower;
    }
}
