package ru.avalon.vergentev.j110.labwork3b;

public class LinkedList {
    public LinkedList prev;
    public LinkedList next;
    public String data;


    //Constructors
    public LinkedList(String data) {
        this.data = data;
        next = null;
        prev = null;
    }

    //Getters and Setters

}
