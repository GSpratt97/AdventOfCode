package com.sparta.greg.Java.day2;

import com.sparta.greg.Java.day2.ReadFile;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // 1-3 a: abcde
        // 1-3 b: cdefg
        // 2-9 c: ccccccccc

        ArrayList<String> passwords = ReadFile.readTXT();
        ArrayList<String[]> splitPasswords = ReadFile.splitString(passwords);

        System.out.println(Validate.extractData1(splitPasswords));
        System.out.println(Validate.extractData2(splitPasswords));



    }
}
