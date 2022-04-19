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
            myList1.modifyElement("GGG"); //модифицируем элементы списка
        System.out.println("The list is:");
            myList1.print(); //выводим наш список (прямой вывод)
        System.out.println("The reversed list is:");
            myList1.printInverse(); //выводим наш список (обратный вывод)
        System.out.print('\n');

        String [] array1 = new String[] {"hh", "jj"}; //задаём массив
            myList1.addArrayToBegin(array1); //добавляем элементы массива в начало списка
            myList1.addArrayToEnd(array1); //добавляем элементы массива в конец списка
        System.out.println("Modified list with array is:");
            myList1.print(); //выводим изменённый список на экран

        ArrayList<String> arrayList = new ArrayList<>(); // задаём коллекцию ArrayList
            arrayList.add("11");
            arrayList.add("22");
            myList1.addCollectionToBegin(arrayList); //добавляем элементы коллекции в начало списка
            myList1.addCollectionToEnd(arrayList); //добавляем элементы коллекции в конец списка
        System.out.println("Modified list with arrayList is:");
            myList1.print(); //выводим изменённый список на экран

        List myList2 = new List();
            myList2.addToEnd("yyy");
            myList2.addToEnd("zzz");
            myList2.addToBegin("XXX");
            myList2.addToBegin("WWW");
        System.out.println("The new list2 is:");
            myList2.print(); //выводим наш список
            myList1.absorptionListToBegin(myList2); //поглощаем созданный список первым списком с добавлением элементом в начало списка, затем удаляем поглощённый список
        System.out.println("Modified list1 with absorption list2 at the begin:");
            myList1.print();
        System.out.println("Is the list2 null? List2 is:");
            myList2.print(); //проверяем что List2 стал пустым

        List myList3 = new List();
            myList3.addToEnd("qqq");
            myList3.addToEnd("rrr");
            myList3.addToBegin("PPP");
            myList3.addToBegin("OOO");
        System.out.println("The new list3 is:");
            myList3.print(); //выводим наш список
            myList1.absorptionListToEnd(myList3); //поглощаем созданный список первым списком с добавлением элементом в конец списка, затем удаляем поглощённый список
        System.out.println("Modified list1 with absorption list3 at the end:");
            myList1.print();
        System.out.println("Is the list3 null? List3 is:");
            myList3.print(); //проверяем что List3 стал пустым

    }
}
