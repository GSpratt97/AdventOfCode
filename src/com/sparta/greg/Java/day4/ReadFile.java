package com.sparta.greg.Java.day4;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    private static String path = "src/com/sparta/greg/Resources/inputFour.txt";
    public static ArrayList<String> passports;

    public static ArrayList<String> readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        passports = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    passports.add(temp);
                    temp = "";
                } else if (line.length()>0) {
                    temp += " " + line;
                }
            }
            passports.add(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(passports.size());

        return passports;
    }
}