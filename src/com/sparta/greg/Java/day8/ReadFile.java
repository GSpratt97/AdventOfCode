package com.sparta.greg.Java.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {
    private static final String path = "src/com/sparta/greg/Resources/inputEight.txt";
    public static List<String> commands;

    public static void readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        String keyAndValues;
        commands = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
//                keyAndValues = line.split(" ");
                commands.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}