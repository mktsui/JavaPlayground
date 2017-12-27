package com.mktsui.playground.java;

import java.util.Arrays;

class InsertionSort {
	// average O(n^2), worst O(n^2)

	static int [] insertSort(int[] unsortList) {
		int position = 0;
		int insertVal = 0;
		
		for (int i=1; i < unsortList.length; i++) {
			insertVal = unsortList[i];
			position = i;
			
			while (position > 0 && unsortList[position-1] > insertVal) {
				unsortList[position] = unsortList[position-1];
				position = position - 1;
			}
			
			unsortList[position] = insertVal;
		}
		
		return unsortList;
	}

	static void insertSortRecur(int[] unsortedList, int n) {

		
		if (n <=0 )
			return;
		
		// put recursion here so front part of array can sort first
		// to prevent swapping of elements (as in the while loop) later on
		insertSortRecur(unsortedList, n-1);
		
		int last = unsortedList[n];
		int j = n;
		
		while(j > 0 && unsortedList[j-1] > last) {
			unsortedList[j] = unsortedList[j-1];
			j--;
		}
		
		unsortedList[j] = last; 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unsort_list= {14, 27, 10, 6, 75, 9};
		
		System.out.println("Before Sort:\n"+Arrays.toString(unsort_list)+"\n");
		System.out.println("After Sorted:\n"+Arrays.toString(insertSort(unsort_list)));
		/* alternative recursive method*/
//		insertSortRecur(unsort_list, unsort_list.length-1);
//		System.out.println("After Sorted:\n"+Arrays.toString(unsort_list));
	}

}
