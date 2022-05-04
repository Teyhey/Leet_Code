package Arrays.CheckIfNAndItsDoubleExist;

public class CheckIfNAndItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                // We want to make sure we aren't including the current index in the search for m*2
                if (arr[y] == arr[x] * 2 && y!=x) return true;
            }
        }
        return false;
    }

}
