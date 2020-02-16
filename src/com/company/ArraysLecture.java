package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLecture {
    public static void main(String[] args) {
        int[] firstCritic = {4, 6, 2, 7};
        int[] secondCritic = {6, 2, 5, 7};
        int[] thirdCritic = {4, 6, 2, 8};
        int[] forthCritic = {1, 7, 4, 3};

        int[][] criticsByCritics = {firstCritic, secondCritic, thirdCritic, forthCritic};

        matrixToArray(criticsByCritics);
    }

    public static void isSixFirstOrLast(int numbers[]) {
        if (numbers[0] == 6 || numbers[numbers.length - 1] == 6) System.out.println("True");
        else System.out.println("False");
    }

    public static void areTwoArraysEqual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first's array length:");
        int firstArray = input.nextInt();
        int[] firstArr = new int[firstArray];
        System.out.println("Enter the first array's elements:");
        for (int i = 0; i < firstArray; i++) {
            firstArr[i] = input.nextInt();
        }
        System.out.println("Enter the second array's length:");
        int secondArray = input.nextInt();
        int[] secondArr = new int[secondArray];
        System.out.println("Enter the second array's elements:");
        for (int i = 0; i < secondArray; i++) {
            secondArr[i] = input.nextInt();
        }

        int i = 0;
        while (firstArr[i] == secondArr[i]) {
            i++;
            if (i == firstArr.length) {
                System.out.println("They are equal!");
                break;
            }
        }
        if (i != firstArr.length) System.out.println("They are not equal!");
    }

    public static void critics() {
        int[] firstCritic = {4, 6, 2, 7};
        int[] secondCritic = {6, 2, 5, 7};
        int[] thirdCritic = {4, 6, 2, 8};
        int[] forthCritic = {1, 7, 4, 3};

        int[][] criticsByCritics = {firstCritic, secondCritic, thirdCritic, forthCritic};

        float[] average = new float[criticsByCritics.length];

        for (int i = 0; i < criticsByCritics.length; i++) {
            for (int j = 0; j < criticsByCritics[i].length; j++) {
                average[i] += criticsByCritics[i][j];
            }
        }
        for (int i = 0; i < criticsByCritics.length; i++) {
            System.out.println("The average grade of " + (i+1) + ". movie is " + average[i]/criticsByCritics[i].length);
        }
    }

    public static void biggerThanSix (){
        int[] firstCritic = {4, 6, 2, 7};
        int[] secondCritic = {6, 2, 5, 7};
        int[] thirdCritic = {4, 6, 2, 8};
        int[] forthCritic = {1, 7, 4, 3};

        int[][] criticsByCritics = {firstCritic, secondCritic, thirdCritic, forthCritic};

        int sum = 0;

        for (int i = 0; i < criticsByCritics.length; i++) {
            for (int j = 0; j < criticsByCritics[i].length; j++) {
                if (criticsByCritics[i][j] > 5) sum++;
            }
        }
        System.out.println("The count of grades bigger than six " + sum);
    }

    public static void matrixToArray(int[][] number){
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                sum++;
            }
        }
        int help = 0;
        int[] arr = new int[sum];
        for (int i = 0; i <number.length ; i++) {
            for (int j = 0; j <number[i].length ; j++) {
                arr[help] = number[i][j];
                help++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] number) {
        int help;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j+1] < number[j]){
                    help = number[j];
                    number[j] = number[j+1];
                    number[j+1] = help;
                }
            }
            System.out.println(Arrays.toString(number));
        }
    }
}
