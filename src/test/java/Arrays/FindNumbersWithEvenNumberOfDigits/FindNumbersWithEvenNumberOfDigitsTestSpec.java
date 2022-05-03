package Arrays.FindNumbersWithEvenNumberOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumbersWithEvenNumberOfDigitsTestSpec {

    @Test
    void findNumbersTest1() {
        int[] nums = {12, 345, 2, 6, 7896};
        int expected = 2;
        int actual = FindNumbersWithEvenNumberOfDigits.findNumbers(nums);
        assertEquals(expected, actual);
    }

    @Test
    void findNumbersTest2() {
        int[] nums = {555, 901, 482, 1771};
        int expected = 1;
        int actual = FindNumbersWithEvenNumberOfDigits.findNumbers(nums);
        assertEquals(expected, actual);
    }
}