package Arrays.ReplaceElementsWithGreatestElementOnRightSide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReplaceElementsWithGreatestElementOnRightSideSpec {

    @Test
    void replaceElementsTest1() {
        int[] input = {17, 18, 5, 4, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        int[] actual = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void replaceElementsTest2() {
        int[] input = {400};
        int[] expected = {-1};
        int[] actual = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void replaceElementsTest3() {
        int[] input = {56903, 18666, 60499, 57517, 26961};
        int[] expected = {60499, 60499, 57517, 26961, -1};
        int[] actual = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(input);
        assertArrayEquals(expected, actual);
    }

}