package org.java.coding;

import org.testng.annotations.Test;

public class SlidingWindow {

    public int maximumSumSubarray(int[] arr, int k){
        int currentSum=0, maxSum=0;

        for(int i=0;i<arr.length;i++){
            maxSum+=arr[i];
        }
       maxSum= Math.max(maxSum, currentSum);

        for(int i=k;i<arr.length;i++){
            currentSum-=arr[i-k];
            currentSum+=arr[i];
            maxSum= Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    @Test
    public void test01(){
        int [] arr = {100, 200, 300, 400}; int k=2;
        int output = maximumSumSubarray(arr, k);
        System.out.println(output);
    }
}
