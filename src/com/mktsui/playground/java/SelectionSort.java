package com.mktsui.playground.java;

import java.util.Arrays;

public class SelectionSort {
	// O(n^2)
	
	public static int[] selectSort(int[] sortList){
		int min;
		int position = 0;
		int temp;
		boolean minFound = false;
		
		for (int i=0; i<sortList.length-1; i++) {
			min = sortList[i];
			position = i;
			minFound = false;
			for (int j=i+1; j<sortList.length; j++){
				if (min > sortList[j]) {
					min = sortList[j];
					position = j;
					minFound = true;
				}
			}
			
			// swap min with pivot
			if (minFound){
				temp = sortList[i];
				sortList[i] = min;
				sortList[position] = temp;
			}
		}
		
		return sortList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedList = {6,4,7,2,1,9,8,5,3};
		
		System.out.println("Unsorted array\n" + Arrays.toString(unsortedList));
		System.out.println("Sorted array\n" + Arrays.toString(selectSort(unsortedList)));
	}

}
