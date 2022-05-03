package Arrays.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int onesCount = 0;
        int maxConsecutive = 0;

        for (int num : nums) {
            if (num == 1) {
                onesCount++;
                if (onesCount > maxConsecutive) {
                    maxConsecutive = onesCount;
                }
            } else {
                onesCount = 0;
            }
        }
        return maxConsecutive;
    }
};