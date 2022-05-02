package Arrays.MaxConsecutiveOnes;

import org.junit.jupiter.api.Test;

import static Arrays.MaxConsecutiveOnes.MaxConsecutiveOnes.findMaxConsecutiveOnes;

class MaxConsecutiveOnesSpec {

    @Test
    void findMaxConsecutiveOnesTest1(){
        int[] test1 = {1,1,0,1,1,1}; // output should be 3
        int expected = 3;
        int actual = findMaxConsecutiveOnes(test1);

        assert actual == expected;
    }

    @Test
    void findMaxConsecutiveOnesTest2(){
        int[] test2 = {1,0,1,1,0,1}; // output should be 2
        int expected = 3;
        int actual = findMaxConsecutiveOnes(test2);

        assert actual == expected;
    }
};