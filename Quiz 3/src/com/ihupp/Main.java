package com.ihupp;

import com.ihupp.Doublylinkedlist;

public class Main {
    public static void main(String[] args){
        Doublylinkedlist dll = new Doublylinkedlist();


        dll.addFist(5);
        dll.Enqueue(8);
        dll.Enqueue(3);
        dll.Enqueue(12);
        dll.Enqueue(0);
        dll.Enqueue(89);
        dll.Enqueue(77);
        dll.Dequeue();
        dll.Dequeue();
        dll.Dequeue();
        dll.printList();
    }
}