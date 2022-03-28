package ru.avalon.vergentev.j110.labwork3b;

import java.util.ArrayList;

public class List {
    private LinkedList head;
    private LinkedList tail;

    //Constructors
    public List() {
        head = null;
        tail = null;
    }

    //Methods
    //метод определяющий является ли элемент пустым
    public boolean isEmpty() {
        return head == null;
    }

    //метод добавления элемента в начало списка
    public void addToBegin (String data) {
        LinkedList element = new LinkedList(data);
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
        LinkedList element = new LinkedList(data);
        element.data = data;
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
        }
        tail = element;
    }

    //прямой метод печатания заданного в main списка с проверкой его пустоты
    public void print () {
        LinkedList element = head;
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
    public void extractionFromBegin () {
        LinkedList element = head;
        System.out.println(element.data);
    }
    //метод извлечения элемента из конца списка
    public void extractionFromEnd () {
        LinkedList element = tail;
        System.out.println(element.data);
    }

    //метод удаления элемента из начала списка
    public void removingFromBegin () {
        head = head.next;
    }
    //метод удаления элемента из конца списка
    public void removingFromEnd () {
        LinkedList element = head;
        while (element != tail) {
            if (element.next == tail) {
                tail = element;
                tail.next = null; break;
            }
            element = element.next;
        }
    }

    //метод определения на содержание заданного значения
    public void keySearch (String key) {
        LinkedList element = head;
        while (element != null) {
            if (element.data == key) {
                System.out.println("There is the searching element " + key + " at the list. ");
                System.out.print('\n');
            }
            element = element.next;
        }
    }

    //метод удаления из списка заданного значения
    public void keySearchAndRemove (String key) {
        LinkedList element = head;
        LinkedList prevElement = head;
        while (element.data != null && element.data != key) {
            prevElement = element;
            element = element.next;
        }

        if (isEmpty()) {
            head = head.next;
        } else {
            prevElement.next = element.next;
        }
    }

    //метод добавления к элементам списка заданного значения
    public void modifyElement (String mod) {
        LinkedList element = head;
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
        System.out.print('\n');
    }
    //метод добавления элементов массива в конец списка
    public void addArrayToEnd (String [] array1) {
        for (String i : array1) {
            addToEnd(i);
        }
        System.out.print('\n');
    }

    //метод добавления элементов коллекции в начало списка
    public void addCollectionToBegin (ArrayList<String> list2) {
        for (int i = list2.size()-1; i >= 0; i--) {
            addToBegin(list2.get(i));
        }
        System.out.print('\n');
    }
    //метод добавления элементов коллекции в конец списка
    public void addCollectionToEnd (ArrayList<String> list2) {
        for (String i : list2) {
            addToEnd(i);
        }
        System.out.print('\n');
    }

    //метод получения N-ого элемента
    public String getElement (int N) {
        int i = 0;
        LinkedList element = head;
        while (element != null && N != i) {
            i++;
            element = element.next;
        }
        if (N >= i) {
            return element.data;
        } else {
            throw new IllegalArgumentException ("index out of the range");
        }
    }

    //метод счёта длины списка
    public int getLength () {
        int i = 0;
        LinkedList element = head;
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

