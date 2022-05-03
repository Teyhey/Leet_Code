package Arrays.SquaresOfASortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquaresOfASortedArraySpec {

    @Test
    void sortedSquaresTest1() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] expectedArray = {0, 1, 9, 16, 100};
        int[] actualArray = SquaresOfASortedArray.sortedSquares(input);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void sortedSquaresTest2() {
        int[] input = {-7, -3, 2, 3, 11};
        int[] expectedArray = {4, 9, 9, 49, 121};
        int[] actualArray = SquaresOfASortedArray.sortedSquares(input);
        assertArrayEquals(expectedArray, actualArray);
    }

}