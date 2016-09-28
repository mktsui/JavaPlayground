package com.mktsui.playground.java;

import java.util.*;


public class HelloWorld {

	public static int[] revSort(int[] ary){
		try {

			for (int i=0;i<ary.length+1;i++)
				ary[i] = ary.length-i;	
		} catch (IndexOutOfBoundsException e) {
		    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		}
		return ary;
	}
	
	public static void main(String[] args) {
		int[] ay= new int[10];
		System.out.println(Arrays.toString(revSort(ay)));
	}

}
