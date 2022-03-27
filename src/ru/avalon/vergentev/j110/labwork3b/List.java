package ru.avalon.vergentev.j110.labwork3b;

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

    //метод печатания заданного в main списка с проверкой его пустоты
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
        tail.prev = tail;
        tail.next = null;
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(tail.prev.data);
        System.out.println(tail.data);
        System.out.print('\n');
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


    //Getters and Setters

}

