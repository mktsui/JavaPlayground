package com.mktsui.playground.java;

import java.util.Arrays;

public class InsertionSort {

	public static int [] insertSort(int[] unsortList) {
		int position = 0;
		int insertVal = 0;
		
		for (int i=1; i < unsortList.length; i++) {
			insertVal = unsortList[i];
			position = i;
			
			while (position > 0 && unsortList[i-1] > insertVal) {
				unsortList[position] = unsortList[position-1];
				position = position - 1;
			}
			
			unsortList[position] = insertVal;
		}
		
		return unsortList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unsort_list= {14, 27, 10, 6, 75, 9};
		System.out.println("Before Sort:\n"+Arrays.toString(unsort_list)+"\n");
		System.out.println("After Sorted:\n"+Arrays.toString(insertSort(unsort_list)));
	}

}
