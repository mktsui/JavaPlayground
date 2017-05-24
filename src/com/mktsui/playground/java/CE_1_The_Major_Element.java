package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* Boyer–Moore majority vote algorithm */
public class CE_1_The_Major_Element {
    public static void main (String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line, elm;
        String[] elmAry;
        int count = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            elmAry = line.split(",");
            count = 0;
            elm = null;
            for (String eachElm:elmAry){
            	if (count == 0){
            		elm = eachElm;
            		count = 1;
            	} else {
            		if (elm.equals(eachElm)){
                		count++;
                	} else {
            			count--;
                	}	
            	}
            }
            count = 0;
            for (String eachElm:elmAry){
            	if (elm.equals(eachElm)){
            		count++;
            	}
            }
            if (count >= (elmAry.length / 2)) {
            	System.out.println(elm);
            } else {
            	System.out.println("None");
            }
            	
        }
    }
}
