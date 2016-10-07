package com.mktsui.playground.java;

import java.util.Arrays;
import com.mktsui.playground.java.SelectionSort;

public class MergeSort {
	// O(n log n)
	
	public static int[] mergeSort(int[] sortList) {
		int listLength = sortList.length;
		int halfLength = listLength / 2;
		
		if (listLength == 1)
			return sortList;
		
		// further divide
		int[] leftList = mergeSort(Arrays.copyOfRange(sortList, 0, halfLength));
		int[] rightList = mergeSort(Arrays.copyOfRange(sortList, halfLength, listLength));
				
		// merge
		System.arraycopy(leftList, 0, sortList, 0, leftList.length);
		System.arraycopy(rightList, 0, sortList, leftList.length, rightList.length);
		
		// sort
		SelectionSort.selectSort(sortList);		
		
		return sortList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedList = {3,1,6,4,2,8,7,9,5};

		System.out.println("Unsorted array\n" + Arrays.toString(unsortedList));
		System.out.println("Sorted array\n" + Arrays.toString(mergeSort(unsortedList)));
	}

}
