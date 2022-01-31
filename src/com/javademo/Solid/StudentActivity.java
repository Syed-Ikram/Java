package com.javademo.Solid;
//follows DIP & SRP
public class StudentActivity {
    public void studyTopic(String s){
        Studies study;
        if(s.equals("java")){
            study = new Java();
            study.learn();
            study.practice();
        }
        else if(s.equals("python")){
            study = new Python();
            study.learn();
            study.practice();
        }
        else{
            System.out.println("course not found");
        }

    }
    public void readBook(String s){
        Book book;
        if(s.equals("java")){
            book = new Java();
            book.read();
        }
        else if(s.equals("python")){
            book = new Python();
            book.read();
        }
        else{
            System.out.println("course not found");
        }
    }
}
