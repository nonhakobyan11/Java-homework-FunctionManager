package com.homework;

public class Main {

    public static void main(String[] args) {
        FunctionManager f = new FunctionManager();
        Human h1 = new Human();

        //Problem 1
        System.out.println("Sum of two int: " + f.sum(3, 5));
        //Problem 2
        System.out.println("Multiply of two double: " + f.mul(3, 5));
        //Problem 3
        System.out.print("Is a greater than b? ");
        f.printFirstIsGreaterThanSecond(3.5F, 5.4F);
        //Problem 4
        System.out.print("Which number is greater? ");
        f.printGreatestNumber(129L, -140L, 155L);

        //Problem 5
        h1.setGender('M');
        System.out.print("Is Male? ");
        h1.maleOrFemale(h1.gender);

        //Problem 9
        int[] numbersInt = {84, 15, 41, 17, 111, 25, 60, 12, 0};
        System.out.println("Maximum element is: " + f.maxElement(numbersInt));

        //Problem 10
        float[] numbersFloat = {74.1F, 56.29F, 147.25F, 10.1F, 114.3F};
        System.out.println("Index of minimum element is: " + f.minIndex(numbersFloat));
    }
}
