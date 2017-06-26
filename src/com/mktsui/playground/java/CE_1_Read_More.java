package com.mktsui.playground.java;

public class CE_1_Read_More {

	public static void main (String[] args) {

		String line = "Tom's mouth watered for the apple, but he stuck to his work.";
		String output = "";
		final String readMore = "... <Read More>";
		int lastSpace;

		if (line.length() > 55) {
			lastSpace = -1;
			output = line.substring(0,40);
			lastSpace = output.lastIndexOf(' ');
			if (lastSpace >= 0) {
				output = output.substring(0,lastSpace) + readMore;
			} else {
				output = output + readMore;
			}
		} else {
			output = line;
		}
		System.out.println(output);
	}

}
