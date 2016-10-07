package com.mktsui.playground.java;

import java.util.Arrays;

public class BubbleSort {
	// average O(n^2), worst O(n^2)

	public static int[] sort(int[] sortList) {
		boolean swapped = false;
		int temp = 0;
		
		for (int i=0; i<sortList.length-1; i++) {
			swapped = false;

			for (int j=0; j<sortList.length-1-i; j++) {
				if (sortList[j]>sortList[j+1]) {
					temp = sortList[j+1];
					sortList[j+1] = sortList[j];
					sortList[j] = temp;
					swapped = true;
				}
			}
			
			// rest of list is sorted
			if (!swapped)
				break;
		}
		
		return sortList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortList = {8,4,7,6,5,9,1,3,2};
		System.out.println("Before Sort:\n" + Arrays.toString(unsortList)+"\n");
		System.out.println("After Sorted:\n" + Arrays.toString(sort(unsortList)));
	}

}
