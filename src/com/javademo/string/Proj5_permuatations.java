package com.javademo.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_permuatations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;

        int NUM_NAMES = 5;
        for(int i = 0;i < NUM_NAMES;i++){
            System.out.println("enter name "+i+"\t");
            fullName = keyboard.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace+1);

            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i = 0;i < firstNames.size();i++){
            System.out.println(firstNames.get(i)+" "+lastNames.get(i));
        }
    }
}
