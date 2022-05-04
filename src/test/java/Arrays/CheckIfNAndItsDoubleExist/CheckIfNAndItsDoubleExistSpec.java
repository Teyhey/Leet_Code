package Arrays.CheckIfNAndItsDoubleExist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfNAndItsDoubleExistSpec {

    @Test
    void checkTest1() {
        int[] input = {10, 2, 5, 3};
        boolean actual = CheckIfNAndItsDoubleExist.checkIfExist(input);
        assertTrue(actual);
    }

    @Test
    void checkTest2() {
        int[] input = {7, 1, 14, 11};
        boolean actual = CheckIfNAndItsDoubleExist.checkIfExist(input);
        assertTrue(actual);
    }

    @Test
    void checkTest3() {
        int[] input = {3, 1, 7, 11};
        boolean actual = CheckIfNAndItsDoubleExist.checkIfExist(input);
        assertFalse(actual);
    }

    @Test
    void checkTest4() {
        int[] input = {-2, 0, 10, -19, 4, 6, -8};
        boolean actual = CheckIfNAndItsDoubleExist.checkIfExist(input);
        assertFalse(actual);
    }

    @Test
    void checkTest5() {
        int[] input = {0, 0};
        boolean actual = CheckIfNAndItsDoubleExist.checkIfExist(input);
        assertTrue(actual);
    }
}