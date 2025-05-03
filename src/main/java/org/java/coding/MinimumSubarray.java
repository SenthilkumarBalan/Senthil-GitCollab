package org.java.coding;

import org.testng.annotations.Test;

public class MinimumSubarray {

    public static int minSubArrayLen(int[] nums, int target){
        int p1=0, p2=0, min=0, preSum=0;
        while(p2<nums.length){
            preSum+=nums[p2];
            while(preSum>=target){
                min= Math.min(preSum, p2-p1+1);
               preSum-=nums[p1];
               p1++;
            }
            p2++;
        }
        return min;
    }

    @Test
    public void test01(){
        int[] arr = {2,3,1,2,4,3}; int target = 7;
        int i = minSubArrayLen(arr, 7);
        System.out.println(i);
    }
    @Test
    public void test02(){
        int[] arr = {1,4,4}; int target = 4;
        int i = minSubArrayLen(arr, target);
        System.out.println(i);
    }

    public void test03(){
        int[] arr = {1,4,4}; int target = 4;
        int i = minSubArrayLen(arr, target);
        System.out.println(i);
    }
}
