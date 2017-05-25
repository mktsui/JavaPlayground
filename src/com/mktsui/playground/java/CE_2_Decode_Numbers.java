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
            // Process line of input Here
        }
    }
}
