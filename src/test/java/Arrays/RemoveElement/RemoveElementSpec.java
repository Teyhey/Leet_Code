package Arrays.RemoveElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementSpec {

    @Test
    void removeElementTest1() {
        int[] input = {3, 2, 2, 3};
        int numberToRemove = 2;
        int expected = 2;
        int actual = RemoveElement.removeElement(input, numberToRemove);
        assertEquals(expected, actual);
    }

    @Test
    void removeElementTest2() {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        int numberToRemove = 2;
        int expected = 5;
        int actual = RemoveElement.removeElement(input, numberToRemove);
        assertEquals(expected, actual);
    }
}