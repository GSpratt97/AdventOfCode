package com.sparta.greg.Java.day6;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    private static String path = "src/com/sparta/greg/Resources/inputSix.txt";
    public static ArrayList<String> questions;

    public static ArrayList<String> readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        questions = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    temp = temp.trim();
                    questions.add(temp);
                    temp = "";
                } else if (line.length()>0) {
                    temp += " " + line;
                }
            }
            questions.add(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }
}