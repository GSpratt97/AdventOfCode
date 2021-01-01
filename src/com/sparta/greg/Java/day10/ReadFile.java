package com.sparta.greg.Java.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String path = "src/com/sparta/greg/Resources/Example.txt";
    public static List<Long> adaptors;

    public static void readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        adaptors = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                adaptors.add(Long.parseLong(line));
//                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}