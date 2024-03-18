package org.example;

public class Main {
    public static void main(String[] args) {
        boolean isBarking=true;
        int clock=1;
        boolean shouldWake = shouldWakeUp(isBarking,clock);
        System.out.println("Hello world!");
    }


    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (isBarking) {
            if (clock >= 8 && clock <= 20) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
