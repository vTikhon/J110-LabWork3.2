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
            myList1.modifyElement("GGG"); //������������ �������� ������
        System.out.println("The list is:");
            myList1.print(); //������� ��� ������ (������ �����)
        System.out.println("The reversed list is:");
            myList1.printInverse(); //������� ��� ������ (�������� �����)
        System.out.print('\n');

        String [] array1 = new String[] {"hh", "jj"}; //����� ������
            myList1.addArrayToBegin(array1); //��������� �������� ������� � ������ ������
            myList1.addArrayToEnd(array1); //��������� �������� ������� � ����� ������
        System.out.println("Modified list with array is:");
            myList1.print(); //������� ��������� ������ �� �����

        ArrayList<String> arrayList = new ArrayList<>(); // ����� ��������� ArrayList
            arrayList.add("11");
            arrayList.add("22");
            myList1.addCollectionToBegin(arrayList); //��������� �������� ��������� � ������ ������
            myList1.addCollectionToEnd(arrayList); //��������� �������� ��������� � ����� ������
        System.out.println("Modified list with arrayList is:");
            myList1.print(); //������� ��������� ������ �� �����

        List myList2 = new List();
            myList2.addToEnd("yyy");
            myList2.addToEnd("zzz");
            myList2.addToBegin("XXX");
            myList2.addToBegin("WWW");
        System.out.println("The new list2 is:");
            myList2.print(); //������� ��� ������
            myList1.absorptionListToBegin(myList2); //��������� ��������� ������ ������ ������� � ����������� ��������� � ������ ������, ����� ������� ����������� ������
        System.out.println("Modified list1 with absorption list2 at the begin:");
            myList1.print();
        System.out.println("Is the list2 null? List2 is:");
            myList2.print(); //��������� ��� List2 ���� ������

        List myList3 = new List();
            myList3.addToEnd("qqq");
            myList3.addToEnd("rrr");
            myList3.addToBegin("PPP");
            myList3.addToBegin("OOO");
        System.out.println("The new list3 is:");
            myList3.print(); //������� ��� ������
            myList1.absorptionListToEnd(myList3); //��������� ��������� ������ ������ ������� � ����������� ��������� � ����� ������, ����� ������� ����������� ������
        System.out.println("Modified list1 with absorption list3 at the end:");
            myList1.print();
        System.out.println("Is the list3 null? List3 is:");
            myList3.print(); //��������� ��� List3 ���� ������

    }
}
