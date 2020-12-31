package com.sparta.greg.Java.day6;

import java.util.Arrays;

public class AnsweredQuestions {
    public static void containsEveryLetter() {
        long lettersContained =0;
        long sum = 0;
        for (String question :ReadFile.questions) {
            lettersContained = checkStringForAllLetterUsingStream(question);
            sum += lettersContained;
        }
        System.out.println(sum);

        retainEveryonesAnswers();


//        lettersContained =0;
//        sum = 0;
//        for (String question :ReadFile.questions) {
//            lettersContained = checkGroupStringForAllLetterUsingStream(question);
//            sum += lettersContained;
//        }
//        System.out.println(sum);
    }

    public static long checkStringForAllLetterUsingStream(String input) {
        long c = input.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count();
        return c;
    }

    static final int MAX_CHAR = 256;
    static int counter =0;


    static void getOccuringChar(String str, int counted)
    {
        int sum =0;
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i)==' ') {
                    break;
                }
                // If any matches found
                if (str.charAt(i) == ch[j]) {
                    find++;

                }

            }
            if (find == counted){
                System.out.println("Number of Occurrence of " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
                counter++;

            }
            System.out.println(counter);
        }
//        System.out.println(counter);
//        System.out.println(sum);

    }

    public static void retainEveryonesAnswers() {
        String[] perPerson;
        String lettersContained = "";
        int count = 0;

        for (String question :ReadFile.questions) {

            perPerson = question.trim().split(" ");
//            System.out.println(perPerson[1]);
            for (int i=0;i<perPerson.length;i++) {
                perPerson[i] = perPerson[i].trim();
            }
//            System.out.println(perPerson[1]);


            System.out.println("----------------");
            System.out.println(Arrays.toString(perPerson));
            count = perPerson.length;
            getOccuringChar(question, count);


        }


    }

}
