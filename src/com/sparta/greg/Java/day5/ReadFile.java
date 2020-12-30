package com.sparta.greg.Java.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private static String path = "src/com/sparta/greg/Resources/inputFive.txt";
    public static ArrayList<String> boardingPasses;

    public static ArrayList<String> readTXT() {
        BufferedReader bufferedReader = null;
        String line;
        boardingPasses = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            while ((line = bufferedReader.readLine()) != null) {
//                if (line.equals("")) {
                    boardingPasses.add(line);
//                System.out.println(line);
//                    temp = "";
//                } else if (line.length()>0) {
//                    temp += " " + line;
//                }
            }
//            boardingPasses.add(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(passports.size());

        return boardingPasses;
    }
}