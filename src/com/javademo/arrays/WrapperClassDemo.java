package com.javademo.arrays;

import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args){
        ArrayList<Integer> myAL = new ArrayList<>();
        myAL.add(10);
        myAL.add(20);
        for(int i = 0;i < myAL.size();i++){
            System.out.println(myAL.get(i));
        }
        String someValue = "320";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        String myPi = "3.143";
        double pi = Double.parseDouble(myPi);
        pi -= 1.23;
        System.out.println(pi);

    }
}
