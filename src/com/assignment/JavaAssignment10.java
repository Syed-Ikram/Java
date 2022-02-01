package com.assignment;

import java.util.*;
import java.io.*;
class SListIterator<T>{
    public SList.Node head;
    SListIterator(SList.Node head){
        this.head = head;
    }
    public void insert(T data){
        SList.Node<T> new_node =  new SList.Node<>(data);
        new_node.next = null;

        if (head == null) {
            head = new_node;
        }
        else {
            SList.Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
    }
    public void deleteByKey(T key)
    {
        SList.Node currNode = head, prev = null;

        if (currNode != null && currNode.data == key) {
            head = currNode.next;
            System.out.println(key + " found and deleted");
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
           prev.next = currNode.next;
           System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
    }
    public void printList()
    {
        SList.Node currNode = head;

        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
class SList {
    Node head ;
    SListIterator iterator;
    public static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            next = null;
        }
    }
    public SListIterator iteratorS(){
        if(iterator == null)
            iterator= new SListIterator(this.head);
        return iterator;
    }
}

public class JavaAssignment10{
    public static void main(String args[]){
        SList myList = new SList();
        SListIterator iter = myList.iteratorS();
        iter.insert("hello");
        iter.insert("world");
        iter.insert("java");
        iter.insert("is");
        iter.insert("fun");
        iter.printList();
        SList myList2 = new SList();
        iter = myList2.iteratorS();
        iter.insert(1);
        iter.insert(2);
        iter.insert(3);
        iter.printList();
        iter = myList.iteratorS();
        iter.insert("and");
        iter.insert("cool");
        iter.deleteByKey("world");
        iter.printList();
        iter = myList2.iteratorS();
        iter.insert(4);
        iter.insert(5);
        iter.printList();
    }
}
