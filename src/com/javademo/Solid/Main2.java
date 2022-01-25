package com.javademo.Solid;

public class Main2 {
    public static void main(String[] args){
        //1
        StudentDetails student = new StudentDetails("Ikram","017");
        student.printDetails();
        Percentage percentage = new Percentage();
        percentage.calculatePercentage();
        //2
        Batminton player1 = new Batminton();
        Cricket player2 = new Cricket();
        player1.play();
        player2.play();
        //3
        VideoGame valorant = new VideoGame();
        valorant.play();
        valorant.useJoystick();
        Basketball baller = new Basketball();
        baller.play();
        baller.wearShoes();
        //4 & 5
        StudentActivity ikram = new StudentActivity();
        ikram.studyTopic(new Python());
        ikram.readBook(new Java());
    }
}
