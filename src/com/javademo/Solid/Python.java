package com.javademo.Solid;
//follows DIP
public class Python implements Studies, Book {
    @Override
    public void learn() {
        System.out.println("studying python");
    }

    @Override
    public void practice() {
        System.out.println("coding python");
    }

    @Override
    public void read() {
        System.out.println("read python book");
    }
}
