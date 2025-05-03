package org.example.DataStructures;

import org.testng.annotations.Test;

public class removeElement {

   public static int removeDuplicatess(int[] nums, int k) {
       int left = 0;
       int right = nums.length - 1;
       while (left <= right) {
           if (nums[left] == k) {
               nums[left] = nums[right];
               right--;
           } else
               left++;
       }
       return left;
   }
   @Test
   public void test01(){
       int[] test1 = {3,2,2,3}; int val=3;
       int result = removeDuplicatess(test1, val);
        System.out.println(result);
   }
   @Test
   public void test02(){
    int[] test2 = {0,1,2,2,3,0,4,2}; int val1=2;
       int result1 = removeDuplicatess(test2, val1);
       System.out.println(result1);
   }
}
