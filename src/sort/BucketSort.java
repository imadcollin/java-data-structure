package sort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        BuSort(new float[] { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
                (float) 0.51 });
    }

    public static void BuSort(float[] arr) {

        int n = arr.length;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i] * n;
            buckets[index].add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            Collections.sort((buckets[i]));
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }

        for (Float i : arr) {
            System.out.println(i);
        }

    }
}
