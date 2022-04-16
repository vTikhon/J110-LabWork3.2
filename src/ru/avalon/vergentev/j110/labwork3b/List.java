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
    public void addToBegin (String data) {
        Linker element = new Linker(data);
        element.data = data;
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }
    //метод добавления элемента в конец списка
    public void addToEnd (String data) {
        Linker element = new Linker(data);
        element.data = data;
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
    }

    //прямой метод печатания заданного в main списка с проверкой его пустоты
    public void print () {
        Linker element = head;
        if (element != null) {
            while (element != null) {
                System.out.println(element.data);
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

    //метод извлечения элемента из начала списка
    public Linker extractionFromBegin () {
        return head;
    }
    //метод извлечения элемента из конца списка
    public Linker extractionFromEnd () {
        return tail;
    }

    //метод удаления элемента из начала списка
    public void removingFromBegin () {
        head = head.next;
    }
    //метод удаления элемента из конца списка
    public void removingFromEnd () {
        Linker element = head;
        while (element != tail) {
            if (element.next == tail) {
                tail = element;
                tail.next = null; break;
            }
            element = element.next;
        }
    }
    //правильный метод удаления элемента из конца списка в случае двусвязного списка (ПОЧЕМУ-ТО НЕ РАБОТАЕТ)
//    public void removingFromEnd () {
//        tail = tail.prev;
//    }

    //метод определения на содержание заданного значения
    public Linker keySearch (String key) {
        Linker element = head;
        while (element != null) {
            if (Objects.equals(element.data, key)) {
                return element;
            }
            element = element.next;
        }
        return null;
    }

    //метод удаления из списка заданного значения
    public void keySearchAndRemove (String key) {
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

    //метод добавления к элементам списка заданного значения
    public void modifyElement (String mod) {
        Linker element = head;
        if (element != null) {
            while (element != null) {
                element.data = element.data + mod;
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
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

    //метод получения N-ого элемента
    public String getElement (int N) {
        int i = 0;
        Linker element = head;
        while (element != null && N != i) {
            i++;
            element = element.next;
        }
        if (N >= i) {
            assert element != null;
            return element.data;
        } else {
            throw new IllegalArgumentException ("index out of the range");
        }
    }

    //метод счёта длины списка
    public int getLength () {
        int i = 0;
        Linker element = head;
        while (element != null) {
            i++;
            element = element.next;
        }
        return i;
    }

    //метод добавления элементов списка в начало списка
    public void addListToBegin (List list1) {
        for (int i = list1.getLength()-1; i >= 0; i--) {
            addToBegin(list1.getElement(i));
        }
        System.out.print('\n');
    }
    //метод добавления элементов списка в конец списка
    public void addListToEnd (List list1) {
        for (int i = 0; i < list1.getLength(); i++) {
            addToEnd(list1.getElement(i));
        }
        System.out.print('\n');
    }

    //обратный метод печатания заданного в main списка с проверкой его пустоты
    public void printInverse () {
        for (int i = getLength()-1; i >= 0; i--) {
            System.out.println(getElement(i));
        }
    }

    //Getters and Setters

}

