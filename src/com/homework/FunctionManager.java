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

    // Problem 5
    public static void maleOrFemale(char gender){
        if(gender == 'M'){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    // Problem 6
    public static String returnOldestLastName(Human human1, Human human2, Human human3) {
        String oldestLastName = human1.birthYear < human2.birthYear ? (human1.birthYear < human3.birthYear ? human1.lastName : human3.lastName) : (human2.birthYear < human3.birthYear ? human2.lastName: human3.lastName);
        return oldestLastName;
    }

    // Problem 7
    public static String returnFirstNames(Human human1, Human human2) {
        return human1.firstName + ", " + human2.firstName;
    }

    // Problem 8
    public static void printHumanDetail(boolean b, Human human){
        if(b){
            System.out.println(human.getFirstName());
        } else {
            System.out.println(human.getLastName());
        }
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
