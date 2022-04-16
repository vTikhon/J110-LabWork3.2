package ru.avalon.vergentev.j110.labwork3b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //работа со списком, который формируется с добавлением элементов в начало и в конец
        List myList1 = new List(); //задаём наш список
            myList1.addToEnd("ccc");
            myList1.addToEnd("ddd");
            myList1.addToBegin("BBB");
            myList1.addToBegin("AAA");
        System.out.println("The list is:");
            myList1.print(); //выводим наш список

        String [] array1 = new String[] {"hh", "jj"}; //задаём массив
            myList1.addArrayToBegin(array1); //добавляем элементы массива в начало списка
            myList1.addArrayToEnd(array1); //добавляем элементы массива в конец списка
        System.out.println("The list with array is:");
            myList1.print(); //выводим изменённый список на экран

        ArrayList<String> arrayList = new ArrayList<>(); // задаём коллекцию ArrayList
            arrayList.add("11");
            arrayList.add("22");
            myList1.addCollectionToBegin(arrayList); //добавляем элементы коллекции в начало списка
            myList1.addCollectionToEnd(arrayList); //добавляем элементы коллекции в конец списка
        System.out.println("The list with array and arrayList is:");
            myList1.print(); //выводим изменённый список на экран

            myList1.addListToEnd(myList1);
            myList1.print();
            myList1.getElement(3); //получение содержимого элемента по номеру
            myList1.getLength(); //длина списка
            myList1.addListToBegin(myList1); //добавляем элементы списка в начало списка
            myList1.addListToEnd(myList1); //добавляем элементы списка в конец списка
            myList1.print();
            myList1.printInverse(); //обратный вывод списка

    }
}
