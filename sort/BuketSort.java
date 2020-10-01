package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt(100) - 50;
        }

        bucketSort(arr);

        for (int i = 0, limit = arr.length - 1; i < limit; ++i) {
            assert arr[i] <= arr[i + 1];
        }
    }

    private static void bucketSort(int[] arr) {
        int max = max(arr);

        int min = min(arr);

        int numberOfBuckets = max - min + 1;

        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);

        for (int i = 0; i < numberOfBuckets; ++i) {
            buckets.add(new ArrayList<>());
        }

        /* store elements to buckets */
        for (int value : arr) {
            int hash = hash(value, min, numberOfBuckets);
            buckets.get(hash).add(value);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
    }

    private static int hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}