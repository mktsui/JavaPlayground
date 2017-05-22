package com.mktsui.playground.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CE_1_The_Major_Element {
    public static void main (String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] eachElm;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            eachElm = line.split(",");
            int[] intElm = new int[eachElm.length];
            for (int i=0; i<eachElm.length; i++){
            	intElm[i] = Integer.parseInt(eachElm[i]);
            }
            Arrays.sort(intElm);
            for (int k:intElm) {
                System.out.println(k);
            }
        }
    }
}
