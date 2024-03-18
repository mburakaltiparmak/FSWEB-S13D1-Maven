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
        boolean isSummer = true;
        int temp = 35;
        boolean isCatPlayingQuestion = isCatPlaying(isSummer,temp);
        System.out.println("Hello world!");
        System.out.println("Should wake up? " + shouldWake);
        System.out.println("Are they teen?" + hasTeenQuestion);
        System.out.println("Is cat playing?" + isCatPlayingQuestion);
        double width = -1.0;
        double height = 4.0;
        double areaResult = area(width,height);
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
        if (isSummer) {
            if(temp >=25 && temp<=45) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (!isSummer) {
            if(temp >=25 && temp<=35){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }
    public static double area(double width, double height) {
        if(width < 0 || height < 0) {
            System.out.println("Parametreler negatif değer alamaz.");
            return -1;
        }
        else {
            double result = width*height;
            System.out.println("area =" + result);
            return result;
        }

    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Radius negatif değer alamaz.");
            return -1;
        }
        else {
            double result = radius*radius*Math.PI;
            System.out.println("Circle area =" + result);
            return result;
        }
    }
}
