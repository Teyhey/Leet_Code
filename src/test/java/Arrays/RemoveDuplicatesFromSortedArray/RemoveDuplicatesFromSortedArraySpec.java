package Arrays.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArraySpec {

    @Test
    void removeDuplicatesTest1() {
        int[] input = {1, 1, 2};
        int expected = 2;
        int actual = RemoveDuplicatesFromSortedArray.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesTest2() {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        int actual = RemoveDuplicatesFromSortedArray.removeDuplicates(input);
        assertEquals(expected, actual);
    }

}