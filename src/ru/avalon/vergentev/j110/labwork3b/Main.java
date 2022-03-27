package ru.avalon.vergentev.j110.labwork3b;

public class Main {
    public static void main(String[] args) {
        List list1 = new List();
        list1.addToEnd("AAA");
        list1.addToEnd("BBB");
        list1.addToEnd("CCC");
        list1.addToEnd("DDD");
        list1.print();
        list1.removingFromBegin();
        list1.removingFromEnd();
        list1.print();


    }
}
