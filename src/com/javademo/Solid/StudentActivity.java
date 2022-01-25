package com.javademo.Solid;
//follows DIP & SRP
public class StudentActivity {
    public void studyTopic(Studies s){
        s.learn();
        s.practice();
    }
    public void readBook(Book b){
        b.read();
    }
}
