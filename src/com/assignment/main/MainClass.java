package com.assignment.main;

import com.assignment.data.Data;
import com.assignment.singleton.Singleton;

public class MainClass {
    public static void main(String[] args){
        Data d = new Data();
        d.printVar();
        d.printLocalVar();

        Singleton s = Singleton.initializeStr("hello");
        s.printStr();
    }
}
