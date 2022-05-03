package Arrays.DuplicateZeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosSpec {

    @Test
    void duplicateZerosTest1(){
        int[] input = {1,0,2,3,0,4,5,0};
        int[] expectedArray = {1,0,0,2,3,0,0,4};
        DuplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedArray, input);
    }

    @Test
    void duplicateZerosTest2(){
        int[] input = {1,2,3};
        int[] expectedArray = {1,2,3};
        DuplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedArray, input);
    }

}