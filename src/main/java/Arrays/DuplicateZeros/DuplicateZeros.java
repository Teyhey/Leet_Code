package Arrays.DuplicateZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        // If no zeros are in our array, then we
        // just return the array back unmodified
        if (Arrays.stream(arr).anyMatch(n -> n == 0)) {
            List<Integer> duplicateList = new ArrayList<Integer>();
            for (int n : arr) {
                if (duplicateList.size() == arr.length) {
                    break;
                }
                duplicateList.add(n);
                if (n == 0) {
                    duplicateList.add(n);
                }
            }
            int[] result = duplicateList.stream().mapToInt(Integer::intValue).toArray();
            for (int x = 0; x < arr.length; x++) {
                arr[x] = result[x];
            }
        }
    }
}
