package com.assignment;

import java.util.*;
import java.io.*;
class SList<T>{
    T val;
    SList<T> next;

    public IteratorSList<T> listIterator(){
        IteratorSList<T> t = new IteratorSList<T>();
        return t;
    }
}

class IteratorSList<T>{
    public SList<T> temp;
    //public SList<T> head;

    IteratorSList(){
        this.temp = new SList<T>();
    }

    public boolean hasNext(){
        if(temp == null) return false;
        if(temp.next == null) return false;
        else return true;
    }

    public void add(T a){
        SList<T> x = new SList<T>();
        x.next = temp;
        x.val = a;
        temp = x;
    }

    public void remove(T a){
        if(temp == null) System.out.println("UnderFlow");
        else temp = temp.next;
    }

    public T next(){
        if(temp == null) return null;
        else {
            T i = temp.val;
            temp = temp.next;
            return i;
        }
    }
}

public class JavaAssignment10{
    public static void main(String args[]){
        SList<String> mylist = new SList<>();
        IteratorSList<String> myIter = mylist.listIterator();
        myIter.add("ikram");
        myIter.add("ikram1");
        myIter.add("ikram2");
        myIter = mylist.listIterator();
        myIter.add("ikramuddin");
        myIter.remove("ikramuddin");
        myIter.add("ikramuddin1");
        myIter.add("ikramuddin2");
        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }
        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }
    }
}
