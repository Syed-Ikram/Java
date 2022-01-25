package com.javademo.Solid;
//follows SRP
public class StudentDetails {
    public String name;
    public String rollNo;
    StudentDetails(String name,String rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void printDetails(){
        System.out.println("name:"+this.name+"\t roll_no:"+this.rollNo);
    }
}
