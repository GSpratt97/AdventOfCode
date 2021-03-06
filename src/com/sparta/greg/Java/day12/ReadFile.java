package com.sparta.greg.Java.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    private static final String path = "src/com/sparta/greg/Resources/inputEleven.txt";
    public static List<String> instructions;

    public static void readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        instructions = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                instructions.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}