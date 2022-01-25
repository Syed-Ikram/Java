package com.assignment;
/*
Names rules
1.Choose descriptive and unambiguous names.
2.Make meaningful distinction.
3.Use pronounceable names.
4.Use searchable names.
5.Replace magic numbers with named constants.
6.Avoid encodings. Don't append prefixes or type information.
Functions rules
1.Small.
2.Do one thing.
3.Use descriptive names.
4.Prefer fewer arguments.
5.Have no side effects.
6.Don't use flag arguments.
  Split method into several independent methods that can be called from the client without the flag.
 */
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
