package com.mktsui.playground.java;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int rank(int key, int[] a) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = a.length - 1;
		while (lo <=hi)
		{
			int mid = lo + (hi - lo)/2;
			if (key < a[mid])
				hi = mid-1;
			else if (key > a[mid])
				lo = mid +1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] whitelist = {1,2,3,4};
		System.out.println("Input a integer to check if it is in the list");
		// Arrays.sort(whitelist);
		while (true)
		{
			Scanner in = new Scanner(System.in);
			int key = in.nextInt();
			if (rank(key, whitelist)>=0) {
				System.out.println(String.valueOf(key)+" is found!");
			}
			else{
				System.out.println("Try again");
			}
		}
	}
}
