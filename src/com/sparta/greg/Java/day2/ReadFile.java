package com.sparta.greg.Java.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> readTXT() {
        ArrayList<String> passwords = new ArrayList<>();
        try {
            File myObj = new File("src/com/sparta/greg/Resources/inputTwo.txt");
            Scanner myReader;
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                passwords.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return passwords;
    }

    public static ArrayList<String[]> splitString(ArrayList<String> wholeString) {
        ArrayList<String[]> splitVariables = new ArrayList<>();
        for (String string :wholeString) {
            splitVariables.add(string.split(" "));
        }
        return splitVariables;
    }
}