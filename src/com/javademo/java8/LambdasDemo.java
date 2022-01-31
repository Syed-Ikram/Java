package com.javademo.java8;

public class LambdasDemo{
    interface FuncInter1{
        int operation(int a, int b);
    }
    interface FuncInter2{
        void sayMessage(String message);
    }
    private int operate(int a, int b, FuncInter1 fobj)    {
        return fobj.operation(a, b);
    }
    public static void main(String args[])    {
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;
        LambdasDemo tobj = new LambdasDemo();
        System.out.println("Addition is " + add.operation(5,6));
        System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));
        FuncInter2 fobj = message ->System.out.println("Hello " + message);
        fobj.sayMessage("Geek");
    }
}