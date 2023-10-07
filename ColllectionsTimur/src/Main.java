

import MyLinkedList.*;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> neise = new MyLinkedList<String>();
        neise.add("Buyurun");
        neise.add("Size");
        neise.add("LinkedList");
        System.out.println(neise);
        neise.add("Varavskoy");
        neise.add("Ailemde");
        neise.add("Mau");
        neise.add("sozu");
        neise.add("Yoxdu!!!!");
        printLinkedListIndexed(neise);

        Scanner console = new Scanner(System.in);
        System.out.print("Enter index of Word to delete from Linked List: ");
        int index = console.nextInt();
        System.out.println("Printered -" + neise.getElementData(index));
        neise.removeElementIndex(index);

        printLinkedListIndexed(neise);

        System.out.print("Select index to insert element: ");
        int first = console.nextInt();
        console.nextLine();
        System.out.print("Insert Element data: ");
        String  input = console.nextLine();


        neise.insertElement(first,input);
        printLinkedListIndexed(neise);

        neise.add("Hazirdir");
        System.out.println(neise);
//


        printLinkedListIndexed(neise);
//
//
//        System.out.println("\n BELE YAXSHIDIR?");
    }

    public static void printLinkedListIndexed(MyLinkedList<String> list)
    {
        for(int i =0;i<list.getLength()+1;i++)
        {


            try{
                System.out.println( i +" - " + list.getElementData(i));
            }catch (RuntimeException ex)
            {
            }
        }
    }
}