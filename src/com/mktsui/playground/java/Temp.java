package com.mktsui.playground.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        char c;
        int i, count;
        
        for (i = 1, c = 'a'; i < 27; i++){
        	hm.put(i, c++);
        }
        
        count = 0;
        
        
	}
	
	private int baseCase(ArrayList<Character> digits){
		if (digits.size() == 0)
			return 0;
		else if (digits.size() == 1)
			return 1;
		else if (digits.size() == 2)
			return ((getDigitInt(digits) > 26) ? 1 : 2);
		else {
			// TO-DO
			return 0;
		}
		
	}
	
	public int getDigitInt(ArrayList<Character> digits){
		StringBuilder sBuilder = new StringBuilder(digits.size());
		for (Character eachChar:digits){
			sBuilder.append(eachChar);
		}
		return Integer.parseInt(sBuilder.toString());
	}

}
