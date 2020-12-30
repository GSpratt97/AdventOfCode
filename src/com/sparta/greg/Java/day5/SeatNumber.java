package com.sparta.greg.Java.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class SeatNumber {
    public static ArrayList<Integer> seatIds;

    public static int seatNumber(){
        loopBoardingPasses(ReadFile.boardingPasses);
        Collections.sort(seatIds);
        Iterator<Integer> iter = seatIds.iterator();
//        System.out.println(seatIds.get(0));
        int value = seatIds.get(0);
        int currentValue = seatIds.get(0);
        while (iter.hasNext()) {
            currentValue = iter.next();

//            System.out.print(currentValue + " ");
//            System.out.println(value);
            value++;
            if (value == currentValue) {
                return value-1;
            }
        }
        return 1;
    }
    // FBFBBFFRLR // r44c5 // 44 * 8 + 5 = 357
    // seatId = (r * 8) + c

    //BFFFBBFRRR: row 70, column 7, seat ID 567.
    //FFFBBBFRRR: row 14, column 7, seat ID 119.
    //BBFFBBFRLL: row 102, column 4, seat ID 820.

    public static void loopBoardingPasses(ArrayList<String> boardingPasses) {
        seatIds = new ArrayList<>();
        int i = 0;
        int largest = 0;
        for (String boardingPass:boardingPasses) {
            String rowBinary = convertRowToBinary(boardingPass);
            String columnBinary = convertColumnToBinary(boardingPass);
            int seatId = (getRow(rowBinary, i)*8)+getRow(columnBinary, i);
            seatIds.add(seatId);
            if(seatId>largest){
                largest = seatId;
            }
        }
        System.out.println(largest);

    }

    public static String convertRowToBinary(String example) {
        String binaryString = "";
        for (int i = 0; i < 7; i++) {
            if (example.charAt(i) == 'F') {
                binaryString += 0;
            } else {
                binaryString += 1;
            }
        }
//        System.out.println(binaryString);
        return binaryString;
    }

    public static String convertColumnToBinary(String example) {
        String binaryString = "";
        for (int i = 7; i < 10; i++) {
            if (example.charAt(i) == 'R') {
                binaryString += 1;
            } else {
                binaryString += 0;
            }
        }
//        System.out.println(binaryString);
        return binaryString;
    }


    public static int getRow(String example, int i){
        int length = example.length();
        if (i == length - 1) {
            return example.charAt(i) - '0';
        }
        return ((example.charAt(i) - '0') << (length-i-1)) + getRow(example, i+1);
    }

    public static void getColumn(){}
}
