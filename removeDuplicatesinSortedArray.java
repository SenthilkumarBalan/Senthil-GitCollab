package org.example.DataStructures;

import org.testng.annotations.Test;

public class removeDuplicatesinSortedArray {

    public static int removeDuplicates(int[] nums){
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
    }
        return left+1;
    }

    @Test
    public void test01(){
        int[] arr={1,1,2};
        int output = removeDuplicates(arr);
        System.out.println(output);
    }

    @Test
    public void test02(){
        int[] arr1={0,0,1,1,1,2,2,3,3,4};
        int output1=removeDuplicates(arr1);
        System.out.println(output1);
    }

}
