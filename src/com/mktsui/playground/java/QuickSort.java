package com.mktsui.playground.java;

import java.util.ArrayList;
import java.util.Arrays;

class QuickSort {
	// Average O(n log n)
	
	static void quickSort(int[] sortList, int i, int j) {
		if (i < j) {
			
		int partition = partFunc(sortList, i, j);
		
		
		quickSort(sortList, i, partition-1);
		quickSort(sortList, partition+1, j);
		}
	}
	
	static int partFunc(int[] sortList, int i, int j){
		int privot = j;
		int temp;
		j--;
		while(j>i){
			while (sortList[i]<sortList[privot]){
				i++;
			}
			while (sortList[j]>sortList[privot]){
				j--;
			}
			if (j>i) {
				temp = sortList[i];
				sortList[i] = sortList[j];
				sortList[j] = temp;
			}
		}
		
		temp = sortList[i];
		sortList[i] = sortList[privot];
		sortList[privot] = temp;
		
		return i;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedList = {3,1,6,4,2,8,7,9,5};
		System.out.println("Unsorted array\n" + Arrays.toString(unsortedList));
		quickSort(unsortedList, 0, unsortedList.length-1);
		System.out.println("Sorted array\n" + Arrays.toString(unsortedList));
	}

}
