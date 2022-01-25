package com.javademo.Solid;

public class Java implements Studies, Book {
    @Override
    public void learn() {
        System.out.println("studying java");
    }

    @Override
    public void practice() {
        System.out.println("coding java");
    }

    @Override
    public void read() {
        System.out.println("read java book");
    }
}
