package com.sparta.greg.Java.day11;

import java.util.Arrays;

public class SeatingSystem {
    public static void initialOccupy() {
        System.out.println(ReadFile.seatingPlan.get(0));

        String[] firstRow = ReadFile.seatingPlan.get(0);
        String[] secondRow = ReadFile.seatingPlan.get(1);
        String[] thirdRow = ReadFile.seatingPlan.get(2);


        for (int i = 0; i < firstRow.length; i++) {
            if (i == 0) {
                System.out.println("0th: " + i);
                if (firstRow[i].equals("L") && !firstRow[i+1].equals("#")) {
                    firstRow[i] = "#";
                }
                System.out.println(Arrays.toString(firstRow));
            } else if (i == firstRow.length-1) {
                System.out.println("nth: " + i);
                if (firstRow[i].equals("L") && !firstRow[i - 1].equals("#")) {
                    firstRow[i] = "#";
                }
                System.out.println(Arrays.toString(firstRow));
            } else {
                System.out.println("middle: "+i);
                if (firstRow[i].equals("L")
                        && (firstRow[i-1].equals(".") || firstRow[i-1].equals("L"))
                        && (firstRow[i+1].equals(".") || firstRow[i+1].equals("L"))) {
                    firstRow[i] = "#";
                }
                System.out.println(Arrays.toString(firstRow));


            }
        }
    }
}
