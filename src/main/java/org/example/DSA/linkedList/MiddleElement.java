package org.example.DSA.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class MiddleElement {
    public static void printMiddle(LinkedList<Integer>list){
        int n=list.get(list.size()/2);
        System.out.println(n);
    }
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(Arrays.asList(1,2,3));
        printMiddle(list);

    }
}
