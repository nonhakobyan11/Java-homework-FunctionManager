package com.homework;

public class Human {
    private String firstName;
    private String lastName;
    private int birthYear;
    public char gender;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getBirthYearYear(){
        return birthYear;
    }

    public void setBirthYear(int bornYear){
        this.birthYear = bornYear;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void maleOrFemale(char gender){
        if(gender == 'M'){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
