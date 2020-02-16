package com.company;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        String loveOfMyLife = "My Precious Nancy";
        String theBestGirlInTheWorld = "Nancy";

        informationInArray();
    }

    public static int whichIsThePositionOfTheSecond(String first, String second) {
        if (first.length() == 0) {
            return -3;
        } else if (first == null || second == null) {
            return -5;
        } else {
            return first.indexOf(second);
        }
    }

    public static void printFormattedNumbersTo(int n) {
        String numbers = "";
        for (int i = 0; i <= n; i++) {
            numbers = numbers.concat(" " + i);
            if (i%60==0) numbers += "\n";
        }
        System.out.println(numbers);
    }

    public static void stringBuilder(int n){
        StringBuilder sb = new StringBuilder();
        String numbers = "";
        for (int i = 0; i <= n; i++) {
            sb.append(" " + i);
            if (i%60==0) sb.append("\n");
        }
        numbers = sb.toString();
        System.out.println(numbers);

    }

    public static void stringFormat(){
        String name = String.format("Name: %s, Age: %d, Lives in %s", "Ivan", 35, "Vratsa");
        System.out.println(name);
    }

    public static void informationInArray(){
        String[] Nancy = {"Нанси Илиева", "България", "Враца", "ул. Ангел Кънчев 20", "1000"};
        String nancy = String.format("%s\n%s\n%s\n%s\n%s\n", Nancy[0],Nancy[1],Nancy[2],Nancy[3],Nancy[4]);
        System.out.println(nancy);
    }
}
