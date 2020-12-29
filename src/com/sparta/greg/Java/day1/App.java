package com.sparta.greg.Java.day1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = ReadFile.readTXT();
        System.out.println("Sum of two:: " +Compare.compareTwo(numbers));
        System.out.println("Sum of three:: " +Compare.compareThree(numbers));
    }
}
