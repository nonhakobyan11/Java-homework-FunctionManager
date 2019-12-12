package com.homework;

public class FunctionManager {
    // Problem 1
    static int sum(int a, int b){
        return a + b;
    }

    // Problem 2
    static double mul(double a, double b){
        return a * b;
    }

    // Problem 3
    static void printFirstIsGreaterThanSecond(float a, float b) {
        if (a > b) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
    }

    // Problem 4
    static void printGreatestNumber(long a, long b, long c){
        long max = a > b  ? (a >  c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }

    // Problem 9
    static int maxElement(int[] numbers){
        if (numbers == null || numbers.length == 0){
            return -1;
        }
        int maxEl = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > maxEl){
                maxEl = numbers[index];
            }
        }
        return maxEl;
    }

    // Problem 10
    static int minIndex(float[] numbers){
        if (numbers == null || numbers.length == 0){
            return -1;
        }
        int indexOfMinEl = 0;
        for(int index = 0; index < numbers.length; ++index){
            if(numbers[indexOfMinEl] > numbers[index]){
                indexOfMinEl = index;
            }
        }
        return indexOfMinEl;
    }
}
