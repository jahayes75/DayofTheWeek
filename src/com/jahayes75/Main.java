package com.jahayes75;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(5);
        }
//        public static void printNumberInWord(int num1){
//            switch (num1) {
//                case 0 -> System.out.println("ZERO");
//                case 1 -> System.out.println("ONE");
//                case 2 -> System.out.println("TWO");
//                case 3 -> System.out.println("THREE");
//                case 4 -> System.out.println("FOUR");
//                case 5 -> System.out.println("FIVE");
//                case 6 -> System.out.println("SIX");
//                case 7 -> System.out.println("SEVEN");
//                case 8 -> System.out.println("EIGHT");
//                case 9 -> System.out.println("NINE");
//                default -> System.out.println("OTHER");
//                }
//
//            }
    public static void printNumberInWord(int num1){
        switch (num1) {
            case 0:
                System.out.println("ZERO");
            break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }

    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        else return (year%4 == 0 && year%100 != 0) || (year%400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch(month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year)? 29 : 28;
            default:
                return 31;
        }
    }
}




