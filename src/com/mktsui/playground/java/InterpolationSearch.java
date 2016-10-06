package com.mktsui.playground.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterpolationSearch {
	// O(log(log n))
	
	public static int search(int[] sortList, int key) {
		int lo = 0;
		int hi = sortList.length-1;
		int largest = hi;
		
		int mid = (hi-lo)/2;
		
		if (key == sortList[mid])
			return 1;
		
		while(lo<hi){
			mid = lo+((hi-lo)/(sortList[hi]-sortList[lo])) * (key - sortList[lo]);
			if (mid>largest || mid<0)
				break;
			if (key>sortList[mid])
				lo = mid + 1;
			else if (key<sortList[mid])
				hi = mid - 1;
			else
				return 1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedList = {1,2,3,4,5,6,7,8,9};
		
		do{
			try{
				System.out.println("Start typing");
				Scanner in = new Scanner(System.in);
				int key = in.nextInt();
				if (search(sortedList, key)>0)
					System.out.println(String.valueOf(key) + " found!\n");
				else
					System.out.println("Not found!\n");
			} catch(InputMismatchException e){
				System.out.println("Incorrect input: " + e + "\n");
			}
		}while(true);
	}

}
