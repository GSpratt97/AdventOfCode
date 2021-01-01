package com.sparta.greg.Java.day10;

import java.util.ArrayList;
import java.util.Collections;

public class Jolt {


    public static Integer[] sortAdaptors() {
        Collections.sort(ReadFile.adaptors);
        ArrayList<Integer[]> combinations = new ArrayList<>();

        Long startingAdaptor = 0L;
        int number1Jolt = 0, number2Jolt = 0, number3Jolt = 0;

        for (int i=0;i<ReadFile.adaptors.size();i++) {
//            System.out.println(ReadFile.adaptors.get(i));

            if (ReadFile.adaptors.get(i) - 1 == startingAdaptor) {
                number1Jolt++;
                startingAdaptor = ReadFile.adaptors.get(i);
            } else if (ReadFile.adaptors.get(i) - 2 == startingAdaptor) {
                number2Jolt++;
                startingAdaptor = ReadFile.adaptors.get(i);

            } else if (ReadFile.adaptors.get(i) - 3 == startingAdaptor) {
                number3Jolt++;
                startingAdaptor = ReadFile.adaptors.get(i);

            }
        }
        number3Jolt++; // Final to phone charger
        Integer[] array = {number1Jolt,number2Jolt,number3Jolt};
        System.out.println("Number of 1 jumps: " + number1Jolt);
        System.out.println("Number of 2 jumps: " + number2Jolt);
        System.out.println("Number of 3 jumps: " + number3Jolt);

        System.out.println("Sum: "+number1Jolt*number3Jolt);;
        return array;

    }

    public static void part2(){



    }
}
