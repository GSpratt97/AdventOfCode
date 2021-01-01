package com.sparta.greg.Java.day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String path = "src/com/sparta/greg/Resources/Example.txt";
    public static List<String[]> seatingPlan;

    public static void readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        String[] array;
        seatingPlan = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split("");
                seatingPlan.add(array);
//                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}