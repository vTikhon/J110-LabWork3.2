package ru.avalon.vergentev.j110.labwork3b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List list1 = new List(); //задаём список
        list1.addToEnd("AAA");
        list1.addToEnd("BBB");
        list1.addToEnd("CCC");
        list1.addToEnd("DDD");
        list1.addToBegin("ddd");
        list1.addToBegin("ccc");
        list1.addToBegin("bbb");
        list1.addToBegin("aaa");
        list1.print(); //прямой вывод списка
        list1.removingFromBegin();
        list1.removingFromEnd();
        list1.print();



//        String [] array1 = new String[] {"hh", "jj", "kk"}; // задаём массив
//        list1.addArrayToBegin(array1); //добавляем элементы массива в начало списка
//        list1.print(); //выводим изменённый список на экран
//        list1.addArrayToEnd(array1); //добавляем элементы массива в конец списка
//        list1.print(); //выводим изменённый список на экран

//        List list2 = new List();  //задаём список
//        list2.addToEnd("aaa");
//        list2.addToEnd("bbb");
//        list2.addToEnd("ccc");
//        list2.addToEnd("ddd");
//        list2.print();
//        ArrayList<String> list3 = new ArrayList<>(); // задаём коллекцию
//        list3.add("11");
//        list3.add("22");
//        list3.add("33");
//        list2.addCollectionToBegin(list3); //добавляем элементы коллекции в начало списка
//        list2.print(); //выводим изменённый список на экран
//        list2.addCollectionToEnd(list3); //добавляем элементы коллекции в конец списка
//        list2.print(); //выводим изменённый список на экран
//        list2.addListToEnd(list1);
//        list2.print();
//        list2.getElement(3); //получение содержимого элемента по номеру
//        list2.getLength(); //длина списка
//        list2.addListToBegin(list1); //добавляем элементы списка в начало списка
//        list2.print();
//        list2.addListToEnd(list1); //добавляем элементы списка в конец списка
//        list2.print();
//        list2.printInverse(); //обратный вывод списка

    }
}
