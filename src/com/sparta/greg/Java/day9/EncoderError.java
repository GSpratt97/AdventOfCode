package com.sparta.greg.Java.day9;

import java.util.Arrays;
import java.util.List;

public class EncoderError {
    public static List<Long> previousNumbers;
    public static List<Long> targetNumbers;
    public static Long targetValue;
    public static final Long WRONG_NUMBER = 36845998L;

    //Wrong value: 36845998

    public static void preamble() {
        int preambleSize = 5;
        for (int i = 0; i < ReadFile.commands.size()-preambleSize; i++) {
            previousNumbers = ReadFile.commands.subList(i, i+preambleSize);
            targetValue = ReadFile.commands.get(i+preambleSize);
//            System.out.println("Sub array: "+previousNumbers);
//            System.out.println("Target number: "+targetValue);
//            System.out.println("Correct: "+check());
            part1();
//            part2();
        }

    }

    public static boolean part1() {
        toHere:for (int j=0;j<previousNumbers.size();j++) {
            for (int k=0;k<previousNumbers.size();k++) {
                if (j == k) {
                    continue;
                }
                if (previousNumbers.get(j) + previousNumbers.get(k) == targetValue) {
//                    System.out.println("True " + previousNumbers.get(j)+"   "+previousNumbers.get(k));
                    return true;
                }
            }
        }
        System.out.println("Wrong value: "+targetValue);
        return false;
    }

    public static void part2() {
        for (int preambleSize = 1; preambleSize < ReadFile.commands.size()-preambleSize; preambleSize++) {
//            System.out.println("Preamble size: "+preambleSize);
            for (int i = 0; i < ReadFile.commands.size()-preambleSize; i++) {
//                System.out.println("     "+i);
                previousNumbers = ReadFile.commands.subList(i, i+preambleSize);
                targetValue = ReadFile.commands.get(i+preambleSize);
//                System.out.println(previousNumbers.size());

                Long sum = previousNumbers.stream().mapToLong(Long::intValue).sum();
//                System.out.println("Sum of list: "+sum);
                if (sum.equals(WRONG_NUMBER)) {
                    System.out.println("This is the sum that makes incorrect number: "  + previousNumbers);
                    targetNumbers = previousNumbers;
                }
            }
        }
        sumLargestAndSmallest();
    }

    public static void sumLargestAndSmallest() {
        Long largest = 0L;
        for (Long number: targetNumbers) {
            if (number > largest) {
                largest = number;
            }
        }
        Long smallest = largest;
        for (Long number: targetNumbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        Long sum = smallest + largest;
        System.out.println(sum);
    }
}
