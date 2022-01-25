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
        VideoGame1 pubg = new VideoGame1();
        pubg.play();
        pubg.playOnPC();
        pubg.useJoystick();
        pubg.wearShoes();
        OutdoorGame1 football = new OutdoorGame1();
        football.wearShoes();
        football.play();
        football.useMouse();
        //4 & 5
        Studies student2 = new Studies();
        student2.bookPython();
        student.studyOnTopic(new Studies());
    }

}
