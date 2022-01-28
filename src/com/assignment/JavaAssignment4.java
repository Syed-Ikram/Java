package com.assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaAssignment4 {
    public static void giveDates(String signUpDate,String currentDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUp = LocalDate.parse(signUpDate, formatter);
        LocalDate current = LocalDate.parse(currentDate, formatter);
        if(current.compareTo(signUp) == -1){
            System.out.println("no range");
            return;
        }
        long yr = current.getYear() - signUp.getYear();
        LocalDate currentSignUp = signUp.plusYears(yr);
        LocalDate signUpStart = currentSignUp.minusDays(30);
        LocalDate signUpEnd = currentSignUp.plusDays(30);
        if(signUpEnd.compareTo(currentSignUp) == 1){
            signUpEnd = current;
        }
        String date1 = signUpStart.format(formatter);
        String date2 = signUpEnd.format(formatter);
        System.out.println(date1+" "+date2);
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int numberInputs = keyboard.nextInt();
        for(int i = 0;i < numberInputs;i++){
            String signUpDate, currentDate;
            signUpDate = keyboard.next();
            currentDate = keyboard.next();
            giveDates(signUpDate, currentDate);
        }

        /*LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println("date :" + text);
        LocalDate signUpDate ;
        LocalDate currentDate ;
        System.out.println(date1.compareTo(date)+" "+date2.compareTo(date));*/
    }
}
