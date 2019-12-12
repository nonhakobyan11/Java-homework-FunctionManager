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
    static void printFirstIsGreaterThenSecond(float a, float b) {
        if (a > b) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
    }
}
