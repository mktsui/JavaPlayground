package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CE_2_Minimum_Coins {

	public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
		int a = 5, b = 3, input = 0, count = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            input = Integer.parseInt(line);
            if (input > 0) {
	    		count = input / a;
	    		
	    		if (input % a > 0){
	    			int remain1 = input % a;
	    			count += remain1 / b;
	    			if (remain1 % b > 0){
	    				count += remain1 % b;
	    			}
	    		}
            } else {
            	count = 0;
            }
    		System.out.println(count);
        }
		
	}
}
