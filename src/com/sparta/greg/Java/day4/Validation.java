package com.sparta.greg.Java.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Validation {
    public static void part1(){
        int legal = 0;

        for (String passport : ReadFile.passports) {
            if (isLegal(passport)) {
                legal++;
            }
        }
        System.out.println(legal);
    }

    public static void part2(){
        int legal = 0;
        int valid = 0;

        for (String passport: ReadFile.passports) {
            if (isLegal(passport) && isValid(passport)) {
                valid++;
            }
        }

        System.out.println(valid);
    }

    private static boolean isLegal(String line) {
        return line.contains("byr:") && line.contains("iyr:") && line.contains("eyr:") && line.contains("hgt:")
                && line.contains("hcl:") && line.contains("ecl:") && line.contains("pid:");
    }


    private static boolean isValid(String pp) {

        String[] split = pp.split(" ");
        for (String s : split) {
            if (s.startsWith("byr:") && !s.replace("byr:", "").matches("19[2-9][0-9]|200[0-2]")) {
                return false;
            } else if (s.startsWith("iyr") && !s.replace("iyr:", "").matches("201[0-9]|2020")) {
                return false;
            } else if (s.startsWith("eyr:") && !s.replace("eyr:", "").matches("202[0-9]|2030")) {
                return false;
            } else if (s.startsWith("hgt:")
                    && !s.replace("hgt:", "").matches("1[5-8][0-9]cm|19[0-3]cm|59in|6[0-9]in|7[0-6]in")) {
                return false;
            } else if (s.startsWith("hcl:") && !s.replace("hcl:", "").matches("#[0-9a-f]{6}")) {
                return false;
            } else if (s.startsWith("ecl:") && !s.replace("ecl:", "").matches("amb|blu|brn|gry|grn|hzl|oth")) {
                return false;
            } else if (s.startsWith("pid:") && !s.replace("pid:", "").matches("[0-9]{9}")) {
                return false;
            }
        }

        return true;

    }
}
