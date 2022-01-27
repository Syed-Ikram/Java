package com.assignment.singleton;

public class Singleton {
    public static String str;
    public static Singleton initializeStr(String str1){
        str = str1;
        return new Singleton();
    }
    // no problem in returning a object of same class.
    // static function cannot refer a non static variable.
    // and static variable doesnot use this keyword.
    public static void printStr(){
        System.out.println("str:"+str);
    }
}
