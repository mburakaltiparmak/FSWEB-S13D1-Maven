package org.example;

public class Main {
    public static void main(String[] args) {
        boolean isBarking=false;
        int clock=2;
        boolean shouldWake = shouldWakeUp(isBarking,clock);
        System.out.println("Hello world!");
        System.out.println("Should wake up? " + shouldWake);
    }


    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (isBarking) {
            if (clock >= 8 && clock <= 20) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }


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
