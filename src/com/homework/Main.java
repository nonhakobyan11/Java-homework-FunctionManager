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
        f.maleOrFemale(h1.gender);

        //Problem 6
        Human human1 = Human.constructor("Karen", "Vardanyan", 1999, 'M');
        Human human2 = Human.constructor("Anahit", "Sahakyan", 2000, 'F');
        Human human3 = Human.constructor("Karine", "Barseghyan", 1997, 'F');
        System.out.println("The last name of oldest human is: " + f.returnOldestLastName(human1, human2, human3));

        //Problem 7
        System.out.println("The first names are: " + f.returnFirstNames(human1, human2));

        //Problem 8
        System.out.print("Problem 8 output is: " );
        f.printHumanDetail(false, human3);

        //Problem 9
        int[] numbersInt = {84, 15, 41, 17, 111, 25, 60, 12, 0};
        System.out.println("Maximum element is: " + f.maxElement(numbersInt));

        //Problem 10
        float[] numbersFloat = {74.1F, 56.29F, 147.25F, 10.1F, 114.3F};
        System.out.println("Index of minimum element is: " + f.minIndex(numbersFloat));

        //Problem 11
        Human humans[] = {human1, human2, human3};
        System.out.println("Sorted array is: " );
        f.getSortedHumansByAscending(humans);

    }
}
