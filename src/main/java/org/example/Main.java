package org.example;

public class Main {
    public static void main(String[] args) {
        boolean isBarking=false;
        int clock=2;
        boolean shouldWake = shouldWakeUp(isBarking,clock);
        int firstAge = 22;
        int secondAge = 23;
        int thirdAge = 34;
        boolean hasTeenQuestion = hasTeen(firstAge, secondAge, thirdAge);
        System.out.println("Hello world!");
        System.out.println("Should wake up? " + shouldWake);
        System.out.println("Are they teen?" + hasTeenQuestion);
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
    if ((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19)) {
        return true;
    } else {
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
