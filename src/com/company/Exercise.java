package com.company;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        studentGrades();
    }

    public static long intToLong(int number){
        long myLong = number;
        return myLong;
    }

    public static void callingContacts(){
        Scanner input = new Scanner(System.in);
        String[] names = {"Nancy","Nancy2","Nancy3","Nancy4","Nancy5","Nancy6","Nancy7","Nancy8","Nancy9"};
        for (int i = 0; i<names.length; i++){
            System.out.println((i+1) + ". " + names[i] + ";");
        }
        System.out.println();
        System.out.println("Who do you want to call?");
        int choice = input.nextInt();

        System.out.println("Calling " + names[choice-1] + "...");
    }

    public static void studentGrades(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 grades!");
        int[] grades = new int[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextInt();
            if (grades[i] < 2 || grades[i] > 6){
                System.out.println("Enter a grade between 2 and 6!");
                i--;
            }
        }

        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        System.out.println("1. The average success is " + String.format("%.2f", (double) sum/grades.length) );
        sum = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > sum) sum = grades[i];
        }
        System.out.println("2. The highest grade is " + (int) sum);
        sum = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < sum) sum = grades[i];
        }
        System.out.println("3. The lowest grade is " + (int) sum);
    }
}
