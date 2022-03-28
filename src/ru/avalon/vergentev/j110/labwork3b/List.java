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
    //����� ������������ �������� �� ������� ������
    public boolean isEmpty() {
        return head == null;
    }

    //����� ���������� �������� � ������ ������
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
    //����� ���������� �������� � ����� ������
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

    //������ ����� ��������� ��������� � main ������ � ��������� ��� �������
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
    //�������� ����� ��������� ��������� � main ������ � ��������� ��� �������
    public void printInverse () {
        LinkedList element = tail;
        if (element != null) {
            while (element != null) {
                System.out.println(element.data);
                element = element.prev;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

    //����� ���������� �������� �� ������ ������
    public void extractionFromBegin () {
        LinkedList element = head;
        System.out.println(element.data);
    }
    //����� ���������� �������� �� ����� ������
    public void extractionFromEnd () {
        LinkedList element = tail;
        System.out.println(element.data);
    }

    //����� �������� �������� �� ������ ������
    public void removingFromBegin () {
        head = head.next;
    }
    //����� �������� �������� �� ����� ������
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

    //����� ����������� �� ���������� ��������� ��������
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

    //����� �������� �� ������ ��������� ��������
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

    //����� ���������� � ��������� ������ ��������� ��������
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

    //����� ���������� ��������� ������� � ������ ������
    public void addArrayToBegin (String [] array1) {
        for (int i = array1.length-1; i >= 0; i--) {
            addToBegin(array1[i]);
        }
        System.out.print('\n');
    }
    //����� ���������� ��������� ������� � ����� ������
    public void addArrayToEnd (String [] array1) {
        for (int i = 0; i < array1.length; i++) {
            addToEnd(array1[i]);
        }
        System.out.print('\n');
    }

    //����� ���������� ��������� ��������� � ������ ������
    public void addCollectionToBegin (ArrayList<String> list2) {
        for (int i = list2.size()-1; i >= 0; i--) {
            addToBegin(list2.get(i));
        }
        System.out.print('\n');
    }
    //����� ���������� ��������� ��������� � ����� ������
    public void addCollectionToEnd (ArrayList<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            addToEnd(list2.get(i));
        }
        System.out.print('\n');
    }

    //���������� ������ � ����������� � ����� ������
    public void absorptionWithAddToEnd (ArrayList<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            addToEnd(list2.get(i));
        }
        System.out.print('\n');
    }


    //Getters and Setters

}

