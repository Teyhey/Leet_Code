package Arrays.MergeSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraySpec {

    @Test
    void mergeTest1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};
        MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void mergeTest2(){
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void mergeTest3(){
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void mergeTest4(){
        int[] nums1 = {4,0,0,0,0,0};
        int m = 1;
        int[] nums2 = {1,2,3,5,6};
        int n = 5;
        int[] expected = {1,2,3,4,5,6};
        MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

}