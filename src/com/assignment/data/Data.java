package com.assignment.data;

public class Data {
    public int num;
    public char ch;
    public void printVar(){
        System.out.println("num: "+this.num+" ch "+this.ch);
    }
    //no problem here
    public void printLocalVar(){
        int num1=0,num2=0;
        System.out.println(num1 +" "+num2);
    }
    // num1 num2 are not intialized
}
