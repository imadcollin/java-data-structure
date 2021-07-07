package arrays;

public class Profit {
    public static void main(String[] args) {
        int max = maxProfit(new int[] { 1, 2, 4, 6, 88, 9, 6 });
        System.out.println("Max Profile is 2 - 88: "+ max);
    }

    public static int maxProfit(int arr[]) {

        int firstDay = arr[1];
        int lowest = arr[0];
        int largest = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > lowest) {
                largest = arr[j];
                lowest = largest;

            }

        }

        return largest - firstDay;

    }
}
