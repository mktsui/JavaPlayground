package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CE_1_Compare_Points {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
		String xDirection = "", yDirection = "";
        String[] line2 = new String[4];
		int[] input = new int[4];
		int[] olCord = new int[2];
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line2 = line.split(" ");
            xDirection = "";
            yDirection = "";
    		for (int i = 0; i < line2.length; i++){
    			input[i] = Integer.parseInt(line2[i]);
    		}
    		olCord[0] = input[2] - input[0];
    		olCord[1] = input[3] - input[1];
    		
    		if (olCord[0] == 0){
    			xDirection = "";
    		} else if (olCord[0] > 0) {
    			xDirection = "E";
    		} else {
    			xDirection = "W";
    		}
    		
    		if (olCord[1] == 0){
    			yDirection = "";
    		} else if (olCord[1] > 0) {
    			yDirection = "N";
    		} else {
    			yDirection = "S";
    		}
    		
    		if (xDirection.equals("") && yDirection.equals("")) {
    			System.out.println("here");
    		} else {
    			System.out.println(yDirection + xDirection);
    		}
        }
    }

}
