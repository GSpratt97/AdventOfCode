package com.sparta.greg.Java.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamesConsole {
    public static int accumulator = 0;
    public static int lineNumber = 0;

    public static void instructions(String line) {
        ArrayList<Integer> vistedLines = new ArrayList<>();

//        ReadFile.commands
        do {
            vistedLines.add(lineNumber);

            System.out.println(line);
            if (line.contains("nop")) {
                System.out.println("Nope");
                line = noOperation(line);
            } else if (line.contains("acc")) {
                System.out.println("Accumulate");
                line = accumulator(line);
            } else if (line.contains("jmp")) {
                System.out.println("Jump");
                line = jump(line);
            }
            System.out.println("Linenumber: "+lineNumber);
            System.out.println("Accumulator: "+accumulator);
        } while (!vistedLines.contains(lineNumber));

    }

    public static String noOperation(String line) {
        lineNumber++;
        line = ReadFile.commands.get(lineNumber);
//        instructions(line);
        return line;
    }

    public static String accumulator(String line) {
        lineNumber++;
        accumulator += Integer.parseInt(line.substring(4));
        line = ReadFile.commands.get(lineNumber);
        return line;
//        System.out.println("Linenumber: "+lineNumber);
//        System.out.println("Accumulator: "+accumulator);
    }

    public static String jump(String line) {
        lineNumber += Integer.parseInt(line.substring(4));
        line = ReadFile.commands.get(lineNumber);
        return line;
//        System.out.println("Accumulator: "+accumulator);

    }
}
