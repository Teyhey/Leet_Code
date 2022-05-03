package Arrays.SquaresOfASortedArray;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int x = 0;
        for (int number : nums) {
            result[x] = number * number;
            x++;
        }
        Arrays.sort(result);
        return result;
    }
}
