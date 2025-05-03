package org.java.coding;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 *  Get array and k variable as input and initialize prefixSum and count as an int variable
 *  Calculate the running sum for the given array by using prefix sum approach
 *  Get the total prefixSum and divide by k variable and get that variable in count and retyrn it.
 */

public class Subarray {
    public int subArray(int [] nums, int k){
        //HashMap<Integer, Integer> output = new HashMap<>();
        //output.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int num: nums){
            prefixSum+=num;
            prefixSum+=prefixSum;
        }
        count=prefixSum/k;

        return count;
    }

    @Test
    public void test01(){
        int[] arr = {4,5,0,-2,-3,1}; int val = 5;
        int finalOutput = subArray(arr, 5);
        System.out.println(finalOutput);
    }
}
