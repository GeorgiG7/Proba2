package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //checking for 5 and 7 division
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int number = input.nextInt();
//
//        if (number % 5 == 0 && number % 7 == 0) {
//            System.out.println("Your number can be divided by 5 and 7! :)");
//        } else if (number % 5 == 0) {
//            System.out.println("Sorry...Your number can't be divided by 7 :(");
//        } else if (number % 7 == 0) {
//            System.out.println("Sorry...Your number can't be divided by 5 :(");
//        } else {
//            System.out.println("Sorry...Your number can't be divided by either 5 or 7 :(");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter one of the the rectangle's sides: ");
//        int a = input.nextInt();
//        System.out.println("Enter the other one: ");
//        int b = input.nextInt();
//        System.out.println("The rectangle's parameter is :" + 2*(a+b) + "\nThe rectangle's area is: " + a*b);

//        boolean isOddBoolean = x % 2 == 0? true: false;
//        int isOddInt = x % 2 == 0? 1: 0;
//        String isOddString = x % 2 == 0? "Yes!": "No!";
//
//        String isNumber = (x % 2 == 0) || (x % 3 == 0)? "yes": "No";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the trapec's upper side: ");
//        int a = input.nextInt();
//
//        System.out.println("Enter the trapec's bottom side: ");
//        int b = input.nextInt();
//
//        System.out.println("Enter the trapec's height: ");
//        int h = input.nextInt();
//
//        System.out.println("The are of the trapec is: " + (a+b)*h/2);

//        int yStart = 1;
//        int yEnd = 3;
//        int xStart = 2;
//        int xEnd = 4;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the \"x\" of the point: ");
//        int x = input.nextInt();
//
//        System.out.println("Enter the \"y\" of the point: ");
//        int y = input.nextInt();
//
//        boolean isBetweenXStartAndXEnd = x <= xEnd && x >= xStart;
//        boolean isBetweenYStartAndYEnd = y <= yEnd && y >= yStart;

//        if (isBetweenXStartAndXEnd && isBetweenYStartAndYEnd) {
//            System.out.println("The point is in the rectangle!");
//        } else {
//            System.out.println("The point is not in the rectangle!");
//        }

//        String isPointInTheRectangle = isBetweenXStartAndXEnd && isBetweenYStartAndYEnd? "Yes": "No";
//        System.out.println(isPointInTheRectangle);

//        int radius = 5;
//        int centerX = 0;
//        int centerY = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the \"x\" of the point: ");
//        int x = input.nextInt();
//
//        System.out.println("Enter the \"y\" of the point: ");
//        int y = input.nextInt();
//
//        if (((x - centerX)*(x - centerX) + (y - centerY)*(y - centerY)) <= radius*radius) {
//            System.out.println("The point is in the circle!");
//        } else {
//            System.out.println("The point in not in the circle!");
//        }

//        int yStart = 1;
//        int yEnd = 5;
//        int xStart = -1;
//        int xEnd = 5;
//
//        int radius = 5;
//        int centerX = 0;
//        int centerY = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the \"x\" of the point: ");
//        int x = input.nextInt();
//
//        System.out.println("Enter the \"y\" of the point: ");
//        int y = input.nextInt();
//
//        boolean isBetweenXStartAndXEnd = x <= xEnd && x >= xStart;
//        boolean isBetweenYStartAndYEnd = y <= yEnd && y >= yStart;
//
//        boolean isInTheRectangle = isBetweenXStartAndXEnd && isBetweenYStartAndYEnd;
//
//        boolean isInTheCircle = ((x - centerX)*(x - centerX) + (y - centerY)*(y - centerY)) <= radius*radius;
//
//        if (isInTheCircle && isInTheRectangle) {
//            System.out.println("The point is in the circle and the rectangle!");
//        } else if (isInTheRectangle) {
//            System.out.println("The point is only in the rectangle!");
//        } else if (isInTheCircle) {
//            System.out.println("The point is only in the circle!");
//        } else {
//            System.out.println("The point isn't in either the circle or the rectangle!");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Is Cvexa in Vratsa? : ");
//        String isCvexaInVratsaString = input.next();
//
//        System.out.println("Which day of the week is now?(1-7) :");
//        int day = input.nextInt();
//
//        boolean isCvexaInVratsa = isCvexaInVratsaString.equalsIgnoreCase("yes");
//
//        String isCvexaFishing = isCvexaInVratsa && day >= 6? "Cvexa is fishing!": "Cvexa is not fishing!";
//        System.out.println(isCvexaFishing);


//        int massOnEarth = 100;
//        int massOnMoon = massOnEarth*17/100;
//
//        System.out.println(massOnMoon);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Въведи цифра!");
//        byte digit = input.nextByte();
//
//        switch (digit){
//            case 0:
//                System.out.println("Нула");break;
//            case 1:
//                System.out.println("Едно");break;
//            case 2:
//                System.out.println("Дше");break;
//            case 3:
//                System.out.println("Три");break;
//            case 4:
//                System.out.println("Четири");break;
//            case 5:
//                System.out.println("Пет");break;
//            case 6:
//                System.out.println("Шест");break;
//            case 7:
//                System.out.println("Седем");break;
//            case 8:
//                System.out.println("Осем");break;
//            case 9:
//                System.out.println("Девет");break;
//            default:
//                System.out.println("Веведи от 0 до 9, баце!");
//        }

//        System.out.println("Въведете сума: ");
//        double sum = input.nextDouble();
//
//        System.out.println("Въведете валута, от която искате да пресмятате(USD, EUR, GBP, BGN): ");
//        String first = input.next();
//
//        System.out.println("Въведете валута, в която искате да пресметнете вашата сума(USD, EUR, GBP, BGN): ");
//        String last = input.next();
//
//        if (first.equals("USD")){
//            if (last.equals("EUR")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("GBP")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("BGN")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else {
//                System.out.println("Въведете валидна валута");
//            }
//        } else if (first.equals("EUR")){
//            if (last.equals("EUR")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("GBP")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("BGN")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else {
//                System.out.println("Въведете валидна валута");
//            }
//        } else if (first.equals("GBP")){
//            if (last.equals("EUR")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("GBP")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("BGN")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else {
//                System.out.println("Въведете валидна валута");
//            }
//        } else if (first.equals("BGN")){
//            if (last.equals("EUR")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("GBP")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else if(last.equals("BGN")){
//                System.out.println("Превърнахте " + sum + first + " във " + last);
//            } else {
//                System.out.println("Въведете валидна валута");
//            }
//        } else {
//            System.out.println("Въведете валидна валута!");
//        }

//        System.out.println("Въведете четирицифрено число: ");
//        int number = input.nextInt();
//
//        if (number > 999 && number < 10000) {
//            int lefting = number % 100;
//            int first = (number - lefting) / 100;
//            int lefting1 = lefting % 10;
//            lefting -= lefting1;
//            lefting = lefting / 10;
//            lefting = lefting1 * 10 + lefting;
//            if (first == lefting) {
//                System.out.println("Числото е полиндорм.");
//            } else {
//                System.out.println("Числото не е полиндром.");
//            }
//        } else {
//            System.out.println("Въведете четирицифрено число!");
//        }



    }
}
