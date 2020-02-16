package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        alcoholMachine(input);
    }

    public static void breakWhenZero(Scanner input) {
        int number;
        do {
            number = input.nextInt();
        } while (number != 0);
    }

    public static void calculateToNumber(int number) {
        int i = 1;
        long res = 0;
        while (i <= number) {
            res += i;
            i++;
        }
        System.out.println(res);
    }

    public static void evenToN(int number) {
        int i = 2;
        while (i <= number) {
            System.out.println(i);
            i += 2;
        }
    }

    public static void evenToNSecondWay(int number) {
        int i = 2;
        while (true) {
            System.out.println(i);
            i++;
            i++;
            if (i > number) break;
        }
    }

    public static void calculateBetweenNumbers(int first, int last) {
        int sum = 0;
        while (first <= last) {
            sum += first;
            first++;
        }
        System.out.println(sum);
    }

    public static void calculateFactorial(int number, int number2) {
        if (number % 6 != 0) number += 6 - (number % 6);
        while (number <= number2) {
            System.out.println(number);
            number += 6;
        }
    }

    public static void calculateOddsToNumber(int number) {
        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }

    public static void calculateToNumberFor(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void calculateFactorialFor(int number) {
        int sum = 1;
        for (int i = 2; i <= number; i++)
            sum *= i;
        System.out.println(sum);
    }

    public static void printNumbersInBetweenDividedByFive(int number, int number2) {
        if (number % 5 != 0) number += 5 - number % 5;
        for (int i = number; i <= number2; i += 5) {
            System.out.println(i);
        }
    }

    public static void printTriangle(int number) {
        String res = "";
        for (int i = 1; i <= number; i++) {
            res += i + " ";
            System.out.println(res);
        }
    }

    public static void printHappyNumbers() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        if (i + j == k + l) System.out.println(i + "" + j + "" + k + "" + l);
                    }
                }
            }
        }
    }

    public static void printStars(int number) {
        String res = "";
        for (int i = 0; i < number; i++) {
            System.out.println(res += "*");
        }
    }

    public static void printStars2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void addTwoNumbers(Scanner input) {
        System.out.println("Enter two numbers to add them(stop when the second one is zero):");
        int number, number2;
        while (true) {
            number = input.nextInt();
            number2 = input.nextInt();
            System.out.println(number + number2);
            if (number2 == 0) break;
        }
    }

    public static void alcoholMachine(Scanner input) {
        float sum = 0;
        while (true) {
            System.out.println("What do you want to drink? \n1)Beer - 2.00$ \n2)Whiskey - 1.50$ \n3)Vodka - 1.50$ \n4)Bourbon - 2.50$");
            int option = input.nextInt();
            if (option == 0) break;
            while(true){
                if (option>0 && option < 5) break;
                System.out.println("You have entered an invalid option! Choose again(1-4)");
                option = input.nextInt();
            }
            System.out.println(("What's your age? (in years)"));
            int age = input.nextInt();
            if (age > 17) {
                switch (option) {
                    case 1:
                        System.out.println("Here is your beer!");
                        sum += 2;
                        break;
                    case 2:
                        System.out.println("Here is your whiskey!");
                        sum += 1.5;
                        break;
                    case 3:
                        System.out.println("Here is your vodka!");
                        sum += 1.5;
                        break;
                    case 4:
                        System.out.println("Here is your bourbon!");
                        sum += 2.5;
                        break;
                }
                System.out.println("Your bill is " + String.format("%.2f", sum) + "$");
            } else System.out.println("You are too young for alcohol!");
        }
    }

    //МАСИВИ!!!!!!!!

}