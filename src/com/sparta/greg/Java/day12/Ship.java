package com.sparta.greg.Java.day12;

import java.util.Arrays;

public class Ship {
    public static int currentDirection = 90;
    public static int[] currentCoordinate = {0, 0};

    public static void part1(){
        System.out.println("");

        for(String instruction: ReadFile.instructions) {
//            System.out.println("Current direction: "+currentDirection);
            direction(instruction);
            System.out.println("New direction: "+currentDirection);
            System.out.println("New coordinate: "+Arrays.toString(currentCoordinate));
        }
        System.out.println("Final coordinate:"+Arrays.toString(currentCoordinate));
        manhattanDistance();
    }

    public static void direction(String directionLetter) {
        switch (directionLetter.charAt(0)) {
            case 'N':
                currentCoordinate[1] += Integer.parseInt(directionLetter.substring(1));
                System.out.println(directionLetter);
                break;
            case 'E':
                currentCoordinate[0] += Integer.parseInt(directionLetter.substring(1));
                System.out.println(directionLetter);
                break;
            case 'S':
                currentCoordinate[1] -= Integer.parseInt(directionLetter.substring(1));
                System.out.println(directionLetter);
                break;
            case 'W':
                currentCoordinate[0] -= Integer.parseInt(directionLetter.substring(1));
                System.out.println(directionLetter);
                break;
            case 'F':
                forward(directionLetter);
                System.out.println(directionLetter);
                break;
            case 'R':
                currentDirection += Integer.parseInt(directionLetter.substring(1));
                if (currentDirection >= 360) {
                    currentDirection -= 360;
                }
                System.out.println(directionLetter);
                break;
            case 'L':
                currentDirection -= Integer.parseInt(directionLetter.substring(1));
                if (currentDirection < 0) {
                    currentDirection += 360;
                }
                System.out.println(directionLetter);
                break;
        }
    }

    public static void forward(String string) {
        switch (currentDirection) {
            case 0:
                currentCoordinate[1] += Integer.parseInt(string.substring(1));
                break;
            case 90:
                currentCoordinate[0] += Integer.parseInt(string.substring(1));
                break;
            case 180:
                currentCoordinate[1] -= Integer.parseInt(string.substring(1));
                break;
            case 270:
                currentCoordinate[0] -= Integer.parseInt(string.substring(1));
                break;
        }
    }

    public static void manhattanDistance() {
        int manhattanDistance = Math.abs(currentCoordinate[0]) + Math.abs(currentCoordinate[1]);

        System.out.println(manhattanDistance);
    }
}
