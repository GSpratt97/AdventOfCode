package com.sparta.greg.Java.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Integer> readTXT() {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File myObj = new File("src/com/sparta/greg/Resources/inputOne.txt");
            Scanner myReader;
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                numbers.add(Integer.parseInt(myReader.nextLine()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
