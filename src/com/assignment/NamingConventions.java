package com.assignment;

import java.time.*;
class DateAndTime{
    LocalDateTime present;
    DateAndTime(){
        this.present = LocalDateTime.now();
    }
    public LocalDateTime getPresent(){
        return present;
    }
    public LocalDateTime getNextDay(){
        return present.plusDays(1);
    }
    public LocalDateTime getAfterTwoYears(){
        return present.plusYears(2);
    }

}
public class NamingConventions{
    public static void main(String[] args){
        DateAndTime dateAndTime = new DateAndTime();
        System.out.println("Date and time of Today is "+dateAndTime.getPresent());
        System.out.println("Date and time of tomorrow is "+ dateAndTime.getNextDay());
        System.out.println("Date and time after two years is "+ dateAndTime.getAfterTwoYears());
        System.out.println(System.currentTimeMillis());
    }
}
