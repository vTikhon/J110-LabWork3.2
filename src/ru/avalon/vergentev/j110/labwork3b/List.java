package ru.avalon.vergentev.j110.labwork3b;

import java.util.Objects;
import java.util.ArrayList;

public class List {
    private Linker head;
    private Linker tail;

    //CONSTRUCTORS
    public List() {
        head = null;
        tail = null;
    }

    //METHODS
    //метод определяющий является ли элемент пустым
    public boolean isEmpty() {
        return head == null;
    }

    //метод добавления элемента в начало списка
    public void addToBegin(String data) {
        Linker element = new Linker(data);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }

    //метод добавления элемента в конец списка
    public void addToEnd(String data) {
        Linker element = new Linker(data);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
    }

    //прямой метод печатания заданного в main списка с проверкой его пустоты
    public void print() {
        try {
            Linker element = head;
            while (element != null) {
                System.out.println(element.data);
                element = element.next;
            }
            System.out.print('\n');
        } catch (IllegalArgumentException e) {
            System.out.println(("The list is null. "));
        }
    }

    //метод извлечения элемента из начала списка (задание для односвязного списка)
    public Linker extractionFromBegin() {
        return head;
    }

    //метод извлечения элемента из конца списка (задание для односвязного списка)
    public Linker extractionFromEnd() {
        return tail;
    }

    //метод удаления элемента из начала списка (задание для односвязного списка)
    public void removingFromBegin() {
        if (head != tail) {
            head = head.next;
        } else {
            head = null;
        }
    }

    //метод удаления элемента из конца списка (задание для односвязного списка)
    public void removingFromEnd() {
        Linker element = head;
        if (head != tail) {
            while (element != tail) {
                if (element.next == tail) {
                    tail = element;
                    tail.next = null;
                    break;
                }
                element = element.next;
            }
        } else {
            head = null;
        }
    }
    //правильный метод удаления элемента из конца списка в случае двусвязного списка (ПОЧЕМУ-ТО НЕ РАБОТАЕТ)
//    public void removingFromEnd () {
//        if (head != tail) {
//            tail = tail.prev;
//        } else {
//            tail = null;
//        }
//    }

    //метод определения на содержание заданного значения (задание для односвязного списка)
    public Linker keySearch(String key) {
        Linker element = head;
        while (element != null) {
            if (Objects.equals(element.data, key)) {
                return element;
            }
            element = element.next;
        }
        return null;
    }

    //метод удаления из списка заданного значения (задание для односвязного списка)
    public void keySearchAndRemove(String key) {
        Linker element = head;
        Linker previousElement = head;
        while (element.data != null && !element.data.equals(key)) {
            previousElement = element;
            element = element.next;
        }
        if (isEmpty()) {
            head = head.next;
        } else if (element == head) {
            head = head.next;
        } else {
            previousElement.next = element.next;
        }
    }

    //метод добавления к элементам списка заданного значения (задание для односвязного списка)
    public void modifyElement(String mod) {
        Linker element = head;
        while (element != null) {
            element.data = element.data + mod;
            element = element.next;
        }
        System.out.print('\n');
    }

    //метод добавления элементов массива в начало списка
    public void addArrayToBegin (String [] array1) {
        for (int i = array1.length-1; i >= 0; i--) {
            addToBegin(array1[i]);
        }
    }
    //метод добавления элементов массива в конец списка
    public void addArrayToEnd (String [] array1) {
        for (String i : array1) {
            addToEnd(i);
        }
    }

    //метод добавления элементов коллекции в начало списка
    public void addCollectionToBegin (ArrayList<String> list2) {
        for (int i = list2.size()-1; i >= 0; i--) {
            addToBegin(list2.get(i));
        }
    }
    //метод добавления элементов коллекции в конец списка
    public void addCollectionToEnd (ArrayList<String> list2) {
        for (String i : list2) {
            addToEnd(i);
        }
    }

    //метод получения N-ого элемента (вспомогательный метод для реализации поглощения списка списком)
    public String getElement (int N) {
        try {
            int i = 0;
            Linker element = head;
            while (element != null && N != i) {
                i++;
                element = element.next;
            }
            if (N >= i) {
                assert element != null;
                return element.data;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("index out of the range");
        }
        return null;
    }

    //метод счёта длины списка (вспомогательный метод для реализации поглощения списка списком)
    public int getLength () {
        int i = 0;
        Linker element = head;
        while (element != null) {
            i++;
            element = element.next;
        }
        return i;
    }

    //метод поглощения списка списком с добавлением его в начало списка
    public void absorptionListToBegin (List list) {
        for (int i = list.getLength()-1; i >= 0; i--) {
            addToBegin(list.getElement(i));
            list.removingFromEnd();
        }
    }
    //метод поглощения списка списком с добавлением его в конец списка
    public void absorptionListToEnd (List list) {
        for (int i = 0; i < list.getLength(); i++) {
            addToEnd(list.getElement(i));
        }
        for (int i = list.getLength()-1; i >= 0; i--) {
            list.removingFromBegin();
        }
    }

    //обратный метод печатания заданного в main списка с проверкой его пустоты
    public void printInverse () {
        for (int i = getLength()-1; i >= 0; i--) {
            System.out.println(getElement(i));
        }
    }

    //Getters and Setters

}

