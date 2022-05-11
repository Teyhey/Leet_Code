package Arrays.ValidMountainArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidMountainArraySpec {

    @Test
    void validMountainTest1() {
        int[] input = {2, 1};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertFalse(actual);
    }

    @Test
    void validMountainTest2() {
        int[] input = {3, 5, 5};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertFalse(actual);
    }

    @Test
    void validMountainTest3() {
        int[] input = {0, 3, 2, 1};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertTrue(actual);
    }

    @Test
    void validMountainTest4() {
        int[] input = {0, 2, 3, 3, 5, 2, 1, 0};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertFalse(actual);
    }

    @Test
    void validMountainTest5() {
        int[] input = {1, 3, 2};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertTrue(actual);
    }

    @Test
    void validMountainTest6() {
        int[] input = {2, 0, 2};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertFalse(actual);
    }

    @Test
    void validMountainTest7() {
        int[] input = {0, 1, 2, 1, 2};
        boolean actual = ValidMountainArray.validMountainArray(input);
        assertFalse(actual);
    }

}