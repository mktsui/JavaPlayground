package com.mktsui.playground.java;

import java.util.Arrays;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		// base case
		
		int ptr = 0;
		for (int i = 0; i<nums.length; i++) {
			if (nums[i] != 0) {
				nums[ptr] = nums[i];
				ptr++;
			}
		}
		
		while (ptr < nums.length) {
			nums[ptr++] = 0;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
