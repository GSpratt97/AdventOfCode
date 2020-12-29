package com.sparta.greg.Java.day1;

import java.util.ArrayList;
import java.util.Iterator;

public class Compare {
    public static int compareTwo(ArrayList<Integer> numbers) {
        int sum =0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == 2020) {
//                    System.out.println(numbers.get(i));
//                    System.out.println(numbers.get(i));
                    sum = (numbers.get(i) * numbers.get(j));
                }
            }
        }
        return sum;
    }

    public static int compareThree(ArrayList<Integer> numbers) {
        int sum =0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                for (int k = 0; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 2020) {
//                        System.out.println(numbers.get(i));
//                        System.out.println(numbers.get(j));
//                        System.out.println(numbers.get(k));
                        sum = (numbers.get(i) * numbers.get(j) * numbers.get(k));
                    }
                }
            }
        }
        return sum;
    }
}
