package ru.avalon.vergentev.j110.labwork3b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //������ �� �������, ������� ����������� � ����������� ��������� � ������ � � �����
        List myList1 = new List(); //����� ��� ������
            myList1.addToEnd("ccc");
            myList1.addToEnd("ddd");
            myList1.addToBegin("BBB");
            myList1.addToBegin("AAA");
        System.out.println("The list is:");
            myList1.print(); //������� ��� ������

        String [] array1 = new String[] {"hh", "jj"}; //����� ������
            myList1.addArrayToBegin(array1); //��������� �������� ������� � ������ ������
            myList1.addArrayToEnd(array1); //��������� �������� ������� � ����� ������
        System.out.println("The list with array is:");
            myList1.print(); //������� ��������� ������ �� �����

        ArrayList<String> arrayList = new ArrayList<>(); // ����� ��������� ArrayList
            arrayList.add("11");
            arrayList.add("22");
            myList1.addCollectionToBegin(arrayList); //��������� �������� ��������� � ������ ������
            myList1.addCollectionToEnd(arrayList); //��������� �������� ��������� � ����� ������
        System.out.println("The list with array and arrayList is:");
            myList1.print(); //������� ��������� ������ �� �����

            myList1.addListToEnd(myList1);
            myList1.print();
            myList1.getElement(3); //��������� ����������� �������� �� ������
            myList1.getLength(); //����� ������
            myList1.addListToBegin(myList1); //��������� �������� ������ � ������ ������
            myList1.addListToEnd(myList1); //��������� �������� ������ � ����� ������
            myList1.print();
            myList1.printInverse(); //�������� ����� ������

    }
}
