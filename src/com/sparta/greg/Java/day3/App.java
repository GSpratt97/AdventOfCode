package com.sparta.greg.Java.day3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> treeMap = ReadFile.readTXT();
        System.out.println(TreeCount.traverse(treeMap));

        int r1d1,r3d1,r5d1,r7d1,r1d2,sum;

        r1d1 = TreeCount.traverse(treeMap,1,1);
        r3d1 = TreeCount.traverse(treeMap,3,1);
        r5d1 = TreeCount.traverse(treeMap,5,1);
        r7d1 = TreeCount.traverse(treeMap,7,1);
        r1d2 = TreeCount.traverse(treeMap,1,2);

        sum = r1d1*r3d1*r5d1*r7d1*r1d2;
        System.out.println(sum);

    }
}
