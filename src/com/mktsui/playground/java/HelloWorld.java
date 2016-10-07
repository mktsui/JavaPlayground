package com.mktsui.playground.java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class HelloWorld {

	public static void main(String[] args) throws InputMismatchException {
		// TODO Auto-generated method stub
		int a;
		float b;
		String s;
		
		do {
			try{
				Scanner in = new Scanner(System.in);
				System.out.println("Say something!");
				//s=in.nextLine();
				//a=in.nextInt();
				b=in.nextFloat();
				System.out.println("Hello World!");
			} catch (InputMismatchException e) {
				System.out.println("Not cool man");
			}
		} while(true);
	}

}
