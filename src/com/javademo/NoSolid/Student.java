package com.javademo.NoSolid;

public class Student {
    public String name;
    public String rollNo;
    public String courseId;
    Student(String name,String rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void printDetails(){
        System.out.println("name:"+this.name+"\t roll_no:"+this.rollNo);
    }
    public void calculatePercentage(){
        System.out.println("calculating %");
    }
    public void courseDetails(){
        System.out.println("course is CSE");
    }
    public void studyOnTopic(Studies s){
        s.learnJava();
    }

}
