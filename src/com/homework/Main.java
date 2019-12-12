package com.homework;

public class Main {

    public static void main(String[] args) {
        FunctionManager f = new FunctionManager();
        System.out.println("Sum of two int: " + f.sum(3, 5));
        System.out.println("Multiply of two double: " + f.mul(3, 5));
        System.out.print("Is a greater than b? ");
        f.printFirstIsGreaterThenSecond(3.5F, 5.4F);
    }
}
