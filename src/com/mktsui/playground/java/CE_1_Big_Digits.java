package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CE_1_Big_Digits {

	public static String[][] bigDigit;
	
	public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
		char[] inputChar;
		String[] output = {"","","","","",""};
		int inputNum = 0;
		
		init();
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            inputChar = line.toCharArray();
            output = new String[] {"","","","","",""};
    		for (char c:inputChar){
    			if(Character.isDigit(c)){
    				inputNum = Character.getNumericValue(c);

    				for (int p = 0; p < 6; p++){
    					output[p] += bigDigit[inputNum][p];
    				}
    			}
    		}
    		if (output[0].length()!=0) {
	    		for (int k = 0; k < 6; k++){
	    			System.out.println(output[k]);
	    		}
    		}
        }

	}
	
	public static void init (){
		String[] allDigits = new String[] 
				{"-**----*--***--***---*---****--**--****--**---**--",
				 "*--*--**-----*----*-*--*-*----*-------*-*--*-*--*-",
			  	 "*--*---*---**---**--****-***--***----*---**---***-",
				 "*--*---*--*-------*----*----*-*--*--*---*--*----*-",
				 "-**---***-****-***-----*-***---**---*----**---**--",
				 "--------------------------------------------------"};
		bigDigit = new String[10][6];
		for (int i = 0, a = 0; i < 50; i += 5) {
			for (int j = 0; j < 6; j++) {
				bigDigit[a][j] = allDigits[j].substring(i, i+5);
			}
			a++;
		}
	}

}
