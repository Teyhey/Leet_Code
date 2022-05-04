package Arrays.RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int totalRemoves = 0;
        for(int x = 0, y = 1; y < nums.length; x++, y++){
            if(nums[x] == nums[y]){
                nums[x] = 1000; // values are from -100 to 100 so this is ok
                totalRemoves++;
            }
        }
        Arrays.sort(nums);
        return nums.length - totalRemoves;
    }
}
