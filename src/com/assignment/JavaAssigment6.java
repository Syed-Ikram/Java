package com.assignment;
//2
class One{
    public String name;
    public int rollNo;
    One(String name){
        this.name=name;
    }
    One(int rollNo,String name){
        this(name);
        this.rollNo=rollNo;
    }
}
//3
class Two{
    public String str;
    Two(String str){
        this.str = str;
        System.out.println("creating object of"+str);
    }
}
public class JavaAssigment6 {
    public static void main(String[] args){
        One obj1 = new One("john");
        One obj2 = new One(17,"jack");
        System.out.println(obj1.toString()+"  "+obj2.toString());

        Two[] arr= new Two[2];
        arr[1] = new Two("Hi");
        arr[0] = new Two("Hello");
    }
}
