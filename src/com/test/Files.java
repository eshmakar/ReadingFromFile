package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        String path = "C:\\1\\1.log";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}