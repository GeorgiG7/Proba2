package com.company;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cube's side: ");
        float a = input.nextFloat();
        calculateCubeArea(a);
        calculateCubeVolume(a);
    }

    public static int whichIsCloserToHundred(int a, int b, int c) {
        if (absoluteValue(100 - a) < absoluteValue(100 - b) && absoluteValue(100 - a) < absoluteValue(100 - c)) {
            return a;
        } else if (absoluteValue(100 - b) < absoluteValue(100 - c) && absoluteValue(100 - b) < absoluteValue(100 - c)) {
            return b;
        } else if (absoluteValue(100 - c) < absoluteValue(100 - b) && absoluteValue(100 - c) < absoluteValue(100 - a)) {
            return c;
        } else {
            return -1;
        }
    }

    public static int whichIsCloserToHundred(int a, int b) {
        if (absoluteValue(100 - a) < absoluteValue(100 - b)) {
            return a;
        } else if (absoluteValue(100 - b) < absoluteValue(100 - a)) {
            return b;
        } else {
            return -1;
        }
    }

    public static int absoluteValue(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static void whichIsBigger(int a, int b) {
        if (a == b) {
            System.out.println("Двете числа са равни");
        } else if (absoluteValue(a - b) > 10) {
            System.out.println("Разлика: " + absoluteValue(a - b));
            int x = a > b ? a : b;
            System.out.println(x + " е по-голямо");
        } else {
            int x = a > b ? a : b;
            System.out.println(x + " е по-голямо");
        }
    }

    public static void isDividedBySevenFiveAndThirteen(int a) {
        if (a % 5 == 0) System.out.println("Дели се на пет");
        if (a % 7 == 0) System.out.println("Дели се на седем");
        if (a % 13 == 0) System.out.println("Дели се на тринайсед");
    }

    public static void isEven(int a) {
        Boolean isEven = a % 2 == 0 ? true : false;
        if (isEven) {
            System.out.println("Четно е.");
        } else {
            System.out.println("Нечетно е.");
        }
    }

    public static void fromCelsiusToFahrenheit(float a) {
        System.out.println("Температура по Фаренхат: " + (a * 1.8 + 32));
    }

    public static void fromFahrenheitToCelsius(float a) {
        System.out.println("Температура по Целсий: " + ((a - 32) / 1.8));
    }

    public static void solveQuadraticEquation(float a, float b, float c) {
        float d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("Няма реални корени!");
        } else {
            b = -b;
            double x1 = (b + Math.pow(d, 0.5)) / (2 * a);
            double x2 = (b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    } //Пета зада - упражнение

    public static void calculateTwoSquaresArea(float a, float b) {
        double areaFirst = a * a;
        double areaSecond = b * b;
        if (areaFirst > areaSecond) {
            System.out.println("The bigger square's area is of the first one - " + areaFirst);
        } else if (areaSecond > areaFirst) {
            System.out.println("The bigger square's area is of the second one - " + areaSecond);
        } else {
            System.out.println("Their areas are equal - " + areaFirst);
        }
    }

    public static void calculateCubeArea(float a) {
        double cubeArea = 6 * a * a;
        System.out.println("The cube area is " + cubeArea);
    }

    public static void calculateCubeVolume(float a) {
        double cubeVolume = a * a * a;
        System.out.println("The cube's volume is " + cubeVolume);
    }
}
