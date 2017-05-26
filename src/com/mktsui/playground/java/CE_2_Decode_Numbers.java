package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CE_2_Decode_Numbers {
    public static void main (String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(new CE_2_Decode_Numbers().baseCase(line));
        }
    }
	
	private int baseCase(String digits){
		if (digits.length() == 0)
			return 0;
		else if (digits.length() == 1)
			return 1;
		else if (digits.length() == 2){
			String a = ""+digits.charAt(0)+digits.charAt(1);
			return (isCharacter(a) ? 2 : 1);
		}
		else {
			int a, b = 0;
			String c = ""+digits.charAt(0)+digits.charAt(1);
			a = baseCase(digits.substring(1, digits.length()));
			if (isCharacter(c))
				b = baseCase(digits.substring(2, digits.length()));
			return a + b;
		}
	}
	
	public static boolean isCharacter(String s) {
		if (0 < Integer.parseInt(s) && Integer.parseInt(s) < 27) {
			return true;
		} else {
			return false;
		}
	}

}
