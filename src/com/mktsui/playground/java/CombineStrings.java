package com.mktsui.playground.java;


public class CombineStrings {

	static void combine (String input, StringBuffer output, int index) {
		for (int i=index; i<input.length(); i++) {
			output.append(input.charAt(i));
			System.out.println(output);
			combine(input, output, i+1);
			output.deleteCharAt(output.length() - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combine("abc", new StringBuffer(), 0);
	}

}
