package com.mktsui.playground.java;

import java.io.*;
public class CE_1_Clean_Up_The_Words {
	public static void main (String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
		char c, lastC = (char)0;
		String output = "";
        while ((line = buffer.readLine()) != null) {
        	output = "";
            line = line.trim();
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				if ((c > 96 && c < 123) || (c > 64 && c < 91) ) {
					output += c;
					lastC = c;
				} else if ((lastC != ' ') && output.length() != 0) {
					output += (char)' ';
					lastC = ' ';
				}
	
			}
			System.out.println(output.trim().toLowerCase());
        }
	}
}
