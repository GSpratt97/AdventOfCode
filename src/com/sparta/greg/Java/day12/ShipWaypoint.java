package com.sparta.greg.Java.day12;

import java.util.Arrays;

public class ShipWaypoint {
    public static int currentDirection = 90;
    public static int[] currentCoordinate = {0, 0};
    public static int[] waypointCoordinate = {10, 1};

    public static void part2(){
        for(String instruction: ReadFile.instructions) {
            direction(instruction);
            System.out.println("New direction: "+currentDirection);
            System.out.println("New coordinate: "+Arrays.toString(currentCoordinate));
            System.out.println("Waypoint coordinate: "+Arrays.toString(waypointCoordinate));
        }
        System.out.println("Final coordinate:"+Arrays.toString(currentCoordinate));
        manhattanDistance();
    }

    public static void direction(String directionLetter) {
        switch (directionLetter.charAt(0)) {
            case 'N':
                waypointCoordinate[1] += Integer.parseInt(directionLetter.substring(1));
                break;
            case 'E':
                waypointCoordinate[0] += Integer.parseInt(directionLetter.substring(1));
                break;
            case 'S':
                waypointCoordinate[1] -= Integer.parseInt(directionLetter.substring(1));
                break;
            case 'W':
                waypointCoordinate[0] -= Integer.parseInt(directionLetter.substring(1));
                break;
            case 'F':
                forward(directionLetter);
                break;
            case 'R':
                rotateRight(directionLetter);
                break;
//                currentDirection += Integer.parseInt(directionLetter.substring(1));
//                if (currentDirection >= 360) {
//                    currentDirection -= 360;
//                }
//                break;
            case 'L':
                rotateLeft(directionLetter);
                break;
//                currentDirection -= Integer.parseInt(directionLetter.substring(1));
//                if (currentDirection < 0) {
//                    currentDirection += 360;
//                }
//                break;
        }
    }

    public static void forward(String string) {
        currentCoordinate[0] += Integer.parseInt(string.substring(1)) * waypointCoordinate[0];
        currentCoordinate[1] += Integer.parseInt(string.substring(1)) * waypointCoordinate[1];
    }

    public static void rotateRight(String string) {
        int temp1 = waypointCoordinate[0];
        int temp2 = waypointCoordinate[1];
        if (Integer.parseInt(string.substring(1))==180) {
            waypointCoordinate[0] = -temp2;
            waypointCoordinate[1] = -temp1;
        } else if (Integer.parseInt(string.substring(1)) == 90) {
            waypointCoordinate[0] = temp2;
            waypointCoordinate[1] = -temp1;
        } else if (Integer.parseInt(string.substring(1)) == 270) {
            waypointCoordinate[0] = -temp1;
            waypointCoordinate[1] = temp2;
        }
    }

    public static void rotateLeft(String string) {
        int temp1 = waypointCoordinate[0];
        int temp2 = waypointCoordinate[1];
        if (Integer.parseInt(string.substring(1))==180) {
            waypointCoordinate[0] = -temp2;
            waypointCoordinate[1] = -temp1;
        } else if (Integer.parseInt(string.substring(1)) == 90) {
            waypointCoordinate[0] = -temp1;
            waypointCoordinate[1] = temp2;
        } else if (Integer.parseInt(string.substring(1)) == 270) {
            waypointCoordinate[0] = temp2;
            waypointCoordinate[1] = -temp1;
        }
    }

    public static void manhattanDistance() {
        int manhattanDistance = Math.abs(currentCoordinate[0]) + Math.abs(currentCoordinate[1]);
        System.out.println(manhattanDistance);
    }
}
