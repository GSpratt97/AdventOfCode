package com.sparta.greg.Java.day7;

import java.util.Arrays;

public class BagCalculator {
    public static String plum = "vibrant plum bags";
    public static String gold = "shiny gold bags";
    public static int numberOfBags = 0;
    public static int totalNumberOfBags = 0;


    public static void goldBags(){
        int goldBags = 0;
        for(String key:ReadFile.rules.keySet()) {
            System.out.println(key);
            if(bags(key)){
                goldBags++;
            }
//            System.out.println(count);
        }
        System.out.println(goldBags);
    }

    public static boolean bags(String colour) {
        int count =0;
        String name;
        String[] bagsInside;

        bagsInside = ReadFile.rules.get(colour);
//        System.out.println(Arrays.toString(bagsInside));

        for (String bag: bagsInside) {
            if (bag.equals("no other bags.")) {
                break;
            }
            name = bag.substring(2);
            name = name.replace(".", "");
            if (name.charAt(name.length()-1) != 's') {
                name += 's';
            }
            if (name.equals(gold)) {
                count++;
            } else {
                if(bags(name)){
                    count++;
                }
            }
        }
        return count > 0;
    }

    public static void counter(){
//        for(String key:ReadFile.rules.keySet()) {
            System.out.println(gold);
            totalNumberOfBags = bagCounter(gold);

//        }
        System.out.println(totalNumberOfBags);
    }
    public static int bagCounter(String colour) {
//        int count =0;
        String name;
        String[] bagsInside;

        bagsInside = ReadFile.rules.get(colour);
//        System.out.println(Arrays.toString(bagsInside));

        for (String bag: bagsInside) {
            if (bag.equals("no other bags.")) {
                break;
            }
            numberOfBags += Character.getNumericValue(bag.charAt(0));
            name = bag.substring(2);
            name = name.replace(".", "");
            if (name.charAt(name.length()-1) != 's') {
                name += 's';
            }
            if (name.equals("dark violet bags")) {
                return 0;
            } else {
                return numberOfBags+=bagCounter(name);
            }

        }
        return numberOfBags;
    }
}
