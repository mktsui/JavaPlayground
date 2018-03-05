package com.mktsui.playground.java;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]){
            	nums[++count] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return ++count;
    }
    
    
}
