package com.sparta.greg.Java.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Validate {
    private static String[] range;
    private static Integer minNumber = 0;
    private static Integer maxNumber = 0;
    private static char letter;
    private static String password;
    private static int validPassword1 = 0;
    private static int validPassword2 = 0;

    public static int extractData1(ArrayList<String[]> splitPasswords) {
        for (String[] array: splitPasswords) {
            range = array[0].split("-");
            minNumber = Integer.parseInt(range[0]);
            maxNumber = Integer.parseInt(range[1]);

            String temp = array[1].replace(":","");
            letter = temp.charAt(0);

            password = array[2];

            int count= 0;
            for (int i=0;i<password.length();i++) {
                if (password.charAt(i) == letter) {
                    count++;
                }
            }
            if (minNumber <= count && count <= maxNumber) {
                validPassword1++;
            }
        }
        return validPassword1;
    }

    public static int extractData2(ArrayList<String[]> splitPasswords) {
        for (String[] array: splitPasswords) {
            range = array[0].split("-");
            minNumber = Integer.parseInt(range[0]);
            maxNumber = Integer.parseInt(range[1]);

            String temp = array[1].replace(":","");
            letter = temp.charAt(0);

            password = array[2];

            if (password.charAt(minNumber -1) == letter
                   && password.charAt(maxNumber -1) == letter) {

            } else if (password.charAt(minNumber -1) == letter
                   || password.charAt(maxNumber-1) == letter) {
               validPassword2++;
            }

        }
        return validPassword2;
    }
}
