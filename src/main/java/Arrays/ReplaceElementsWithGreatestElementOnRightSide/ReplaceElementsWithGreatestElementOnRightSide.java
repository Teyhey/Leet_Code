package Arrays.ReplaceElementsWithGreatestElementOnRightSide;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            int maxVal = 0;
            // If we hit the end of the list then set the last value to -1
            if (x == arr.length - 1) {
                arr[x] = -1;
                break;
            }
            for(int y = x+1; y < arr.length; y++){
                if(arr[y] >= maxVal){
                    maxVal = arr[y];
                    // We want to find the max value excluding our current int at the current index.
                    arr[x] = maxVal;
                }
            }
            System.out.println("Max Value is: " + maxVal);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
