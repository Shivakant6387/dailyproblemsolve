package org.example.DSA.linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void printReverse(LinkedList<Integer>list){
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        printReverse(list);
    }
}
