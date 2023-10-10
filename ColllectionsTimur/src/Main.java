

import Chains.*;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("Buyurun");
        list.add("Size");
        list.add("LinkedList");
        list.add("Varavskoy");
        list.add("Ailemde");
        list.add("MIAU");
        list.add("sozu");
        list.add("Yoxdu!!!!");
        System.out.println(list.getLength());
        System.out.println("*********************************");
       printLinkedList(list);



    }///Insertion completed
    //Swapp method to be implemented and checked
    public static void printLinkedList(MyLinkedList<String> test)
    {

        try {            for (int i = 0; i < test.getLength(); i++) {

        System.out.println(i + " - " + test.getElementData(i));

    }
    } catch (RuntimeException ex) {
    }
}
}