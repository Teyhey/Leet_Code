package Arrays.ValidMountainArray;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        boolean result = false;
        boolean hitPeak = false;
        // first condition check length >= 3
        if (arr.length >= 3) {
            for (int x = 0, y = 1; y < arr.length; x++, y++) {
                if (arr[x] < arr[y] && !hitPeak) {
                    System.out.println("Mountain is now increasing...[" + arr[x] + "] -> [" + arr[y] + "]");
                } else if (arr[x] > arr[y] && x!=0) {
                    hitPeak = true;
                    System.out.println("You've hit a peak: " + arr[x]);
                } else if (arr[x] == arr[y] || arr[x] > arr[y] && x==0 || arr[x] < arr[y] && hitPeak) {
                    System.out.println("Mountain is not strictly increasing and/or decreasing!");
                    return false;
                }
                // If we hit a peak, then we must be strictly decreasing now
                if (hitPeak && arr[x] > arr[y]) {
                    result = true;
                    System.out.println("Mountain is now decreasing...[" + arr[x] + "] -> [" + arr[y] + "]");
                }
            }
        } else {
            System.out.println("Array is too small!");
        }
        return result;
    }

}
