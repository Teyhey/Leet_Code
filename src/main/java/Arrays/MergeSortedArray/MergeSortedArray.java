package Arrays.MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        // If 0 is found in the array, we can say the array
        // has space for the merging of the other array
        if (Arrays.stream(arr1).anyMatch(num -> num == 0)) {
            for (int y = m, x = 0; y < arr1.length; y++, x++) {
                arr1[y] = arr2[x];
            }
            Arrays.sort(arr1);
        }
    }
}
