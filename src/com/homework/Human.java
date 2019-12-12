package com.homework;

public class Human {
    public String firstName;
    public String lastName;
    public int birthYear;
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

    public int getBirthYear(){
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

    public static Human constructor(String firstName, String lastName, int birthYear, char gender) {
        Human human = new Human();
        human.setFirstName(firstName);
        human.setLastName(lastName);
        human.setGender(gender);
        human.setBirthYear(birthYear);
        return human;
    }

    public void printHumanInfo() {
        System.out.println("Name: " + this.getFirstName() + " " + "Surname: " + this.getLastName() + " " + "Gender: " + this.getGender() + " " +  "Birth year: " + this.getBirthYear());
    }

}
