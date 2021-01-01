package com.sparta.greg.Java.day8;

public class App {
    public static void main(String[] args) {
        ReadFile.readTXT();
        GamesConsole.instructions(ReadFile.commands.get(0));
        //nop +0
        //acc +1
        //jmp +4
        //acc +3
        //jmp -3
        //acc -99
        //acc +1
        //jmp -4
        //acc +6

        // Answer part1: 1832
    }
}
