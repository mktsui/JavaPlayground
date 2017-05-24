package com.mktsui.playground.java;

import java.util.HashMap;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char i;
        int j;
        for (i = 'a', j = 0; i < 'k'; i++){
        	hm.put(i, j++);
        }
        
		System.out.println(hm.get('a'));
		System.out.println(hm.get('b'));
		System.out.println(hm.get('j'));
		System.out.println(hm.get('k'));
	}

}
