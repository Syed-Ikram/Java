package com.javademo.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj2_arrayList {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<Double>();
        double input;
        System.out.println("enter values ; to exit enter -1");
        input = keyboard.nextDouble();
        while(input >= 0){
            myList.add(input);
            input = keyboard.nextDouble();
            System.out.println("enter values ; to exit enter -1");
        }
        for(int i = myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
}
