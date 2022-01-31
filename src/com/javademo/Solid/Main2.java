package com.javademo.Solid;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
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
        String str;
        System.out.println("enter subject you want study (java or python)");
        str = keyboard.next();
        ikram.studyTopic(str);
        ikram.readBook(str);
    }
}
