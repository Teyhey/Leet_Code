package Arrays.RemoveElement;

import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int newLength = 0;
        for(int x = 0; x < nums.length; x++){
            if(nums[x] == val){
                nums[x] = 1000;
            } else {
                newLength++;
            }
        }
        Arrays.sort(nums); // so the beginning elements are the ones we kept
        return newLength;
    }
}
