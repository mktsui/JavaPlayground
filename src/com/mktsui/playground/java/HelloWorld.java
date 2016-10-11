package com.mktsui.playground.java;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a;
		float b;
		String s;
		int [] ary = new int[10];
		
		do {
			try{
				Scanner in = new Scanner(System.in);
				System.out.println("Say something!");
				//s=in.nextLine();
				//a=in.nextInt();
				b=in.nextFloat();
				System.out.println("Hello World!");
			} catch (InputMismatchException e) {
				System.out.println(Arrays.toString(revSort(ary)) + " Not cool man");
			}
		} while(true);
	}
		
	public static int[] revSort(int[] ary){
		try {
			for (int i=0;i<ary.length;i++)
				ary[i] = ary.length-i;
		} catch (IndexOutOfBoundsException e) {
		    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		}
		return ary;
	}
	

}
