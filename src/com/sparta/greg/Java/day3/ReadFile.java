package com.sparta.greg.Java.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> readTXT() {
        ArrayList<String> passwords = new ArrayList<>();
        try {
            File myObj = new File("src/com/sparta/greg/Resources/inputThree.txt");
            Scanner myReader;
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                passwords.add(line + line + line + line+ line + line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line+ line + line+ line + line + line+ line + line + line+ line + line);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return passwords;
    }
}