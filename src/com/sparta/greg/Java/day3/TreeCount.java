package com.sparta.greg.Java.day3;

import java.util.ArrayList;

public class TreeCount {
    private static int column=0;
//    private static int row=0;
    private static int count=0;


    public static int traverse(ArrayList<String> treeMap) {
        column=0;
        count=0;
        for (String rowValue:treeMap) {
            if (rowValue.charAt(column) == '#') {
                count++;
            }
            column += 3;
        }
        return count;
    }

    public static int traverse(ArrayList<String> treeMap, int right, int down) {
        column=0;
        count=0;
        for (int i=0;i<treeMap.size();i+=down) {
            if (treeMap.get(i).charAt(column) == '#') {
                count++;
            }
            column += right;
        }
        return count;
    }
}
