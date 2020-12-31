package com.sparta.greg.Java.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    private static String path = "src/com/sparta/greg/Resources/Example.txt";
    public static Map <String, String[]> rules;

    public static HashMap<String, String[]> readTXT() {
        BufferedReader bufferedReader = null;
        String line, key;
        String[] keyAndValues, values;

        rules = new HashMap<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                keyAndValues = line.split("contain ");
                key = keyAndValues[0].trim();
                System.out.print("Key: "+keyAndValues[0]);

                values = keyAndValues[1].split(", ");
                for(String value:values) {
                    System.out.print(" ||Value: " + value);
                }
                System.out.println("");
                rules.put(key, values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(rules.size());
        return null;
    }
}