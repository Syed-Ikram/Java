package com.javademo.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj3_arrayList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        String name;
        int age;
        for(int i = 0;i < 5;i++){
            System.out.println("enter name");
            name = keyboard.nextLine();
            System.out.println("enter age");
            age = keyboard.nextInt();
            keyboard.nextLine();
            names.add(name);
            ages.add(age);
            System.out.println();
        }
        for(int i = 0;i < names.size();i++){
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old.");
        }
    }
}
