package com.sparta.greg.Java.day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String path = "src/com/sparta/greg/Resources/inputNine.txt";
    public static List<Long> commands;

    public static void readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        commands = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                commands.add(Long.parseLong(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}