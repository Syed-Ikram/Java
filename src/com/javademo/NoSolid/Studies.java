package com.javademo.NoSolid;

public class Studies implements Topics{
    @Override
    public void learnJava() {
        System.out.println("studying java");
    }

    @Override
    public void learnPython() {
        System.out.println("studying python");
    }

    @Override
    public void bookJava() {
        System.out.println("Read java");
    }

    @Override
    public void bookPython() {
        System.out.println("Read Python");
    }

    @Override
    public void buyBooks() {

    }

    @Override
    public void teachTopics() {

    }
}
