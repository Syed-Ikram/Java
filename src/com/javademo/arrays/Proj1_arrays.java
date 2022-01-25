package com.javademo.arrays;

import java.util.Scanner;

public class Proj1_arrays {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int[] someValues = new int[5];
         for(int i=0;i<someValues.length;i++){
             System.out.println("enter a integer");
             someValues[i]=keyboard.nextInt();
         }

        for(int i=0;i<someValues.length;i++){
            System.out.println(someValues[i]*2);
        }
    }
}
