package com.sparta.greg.Java.day9;

public class App {
    public static void main(String[] args) {
        ReadFile.readTXT();
        for(Long i : ReadFile.commands) {
//            System.out.println(i);
        }
//        EncoderError.preamble();

        EncoderError.part2();
        // Wrong value, part 1: 36845998
    }
}
