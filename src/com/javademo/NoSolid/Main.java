package com.javademo.NoSolid;

public class Main {
    public static void main(String[] args){
        //1
        Student student = new Student("Student","11");
        student.printDetails();
        student.calculatePercentage();
        student.courseDetails();
        //2
        Sports sport = new Sports();
        sport.playBasketball();
        sport.playBadminton();
        //3
        Valorant pubg = new Valorant();
        pubg.play();
        pubg.playOnPC();
        pubg.useJoystick();
        pubg.wearShoes();
        Basketball football = new Basketball();
        football.wearShoes();
        football.play();
        football.useMouse();
        //4 & 5
        Studies student2 = new Studies();
        student2.bookPython();
        student.studyOnTopic(new Studies());
    }

}
