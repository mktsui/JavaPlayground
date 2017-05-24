package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CE_1_Hidden_Digits {

    public static void main (String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char i,p;
        int j,k;
        for (i = 'a', j = 0, p='0', k = 0; i < 'k'; i++){
        	hm.put(p++, k++);
        	hm.put(i, j++);
        }
        Integer temp;
        String result;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            result = "";
            char[] lineChar = line.toCharArray();
            for (char eachChar:lineChar){
            	temp = hm.get(eachChar);
            	if (temp != null) {
                	System.out.print(temp);
                	result += temp.toString();
            	}
            }
            if (result.equals(""))
            	System.out.print("NONE");
            System.out.print('\n');
            lineChar = null;
        }
    }

}
