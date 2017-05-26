package com.mktsui.playground.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String digits = "122124";

        System.out.println(new Temp().baseCase(digits));
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
