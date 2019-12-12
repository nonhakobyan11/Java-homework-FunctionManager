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
}
