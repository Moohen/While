package com.moohen;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 20;
        while (isEvenNumber(count)) {
            if (count == 100) {
                break;
            }
            System.out.println("Even numbers are " + count);
            count++;
        }

    }

    private static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
