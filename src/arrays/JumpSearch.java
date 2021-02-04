package arrays;

public class JumpSearch {
    public static void main(String[] args) {
        int index = Jump(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 3);
        print(3, index);
    }

    /**
     * algorithm JumpSearch is input: An ordered list L, its length n and a search
     * key s. output: The position of s in L, or nothing if s is not in L.
     * 
     * a ← 0 b ← ⌊√n⌋
     * 
     * while Lmin(b,n)-1 < s do a ← b b ← b + ⌊√n⌋ if a ≥ n then return nothing
     * 
     * while La < s do a ← a + 1 if a = min(b, n) return nothing
     * 
     * if La = s then return a else return nothing
     */
    public static int Jump(int arr[], int s) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int s = 4;
        int a = 0;
        int b = (int) Math.floor(Math.sqrt(arr.length));
        while (arr[(Math.min(b, arr.length) - 1)] < s) {
            a = b;
            b = b + arr[(int) Math.floor(Math.sqrt(arr.length))];
            if (a >= arr.length) {
                return -1;
            }
        }
        while (arr[a] < s) {
            a = a + 1;
            if (a == Math.min(b, arr.length)) {
                return -1;
            }
        }
        if (arr[a] == s)
            return a;
        else
            return -1;
    }

    public static void print(int element, int index) {
        if (index == -1)
            System.out.println("The element not found ...!");
        else
            System.out.println("The element:" + element + " is in Index [" + index + "]");
    }

}
