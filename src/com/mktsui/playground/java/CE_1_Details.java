package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CE_1_Details {

    public static void main (String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] eachCell;
        int xIndex, yIndex, lineMin = 0;
        while ((line = buffer.readLine()) != null) {
        	lineMin = 10;
            line = line.trim();
            // Process line of input Here
            eachCell = line.split(",");
            for (String i: eachCell){
            	xIndex = i.lastIndexOf("X");
            	yIndex = i.indexOf("Y");
            	if ((yIndex >=0 && xIndex >=0) && (yIndex > xIndex)){
	            		lineMin = Math.min(lineMin, (yIndex - xIndex - 1));
            	} else {
            		lineMin = -1;
            	}
            }
            
            System.out.println(lineMin);
        }
    }

}