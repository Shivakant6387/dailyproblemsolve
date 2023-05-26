package org.example.DSA.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class SwapLinkedListElement {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(Arrays.asList(10,11,12,13,14,15));
        int element1=11;
        int element2=15;
        System.out.println("LinkedList Before Swapping");
        for (int i:list){
            System.out.print(i+" ");
        }
        swapping(list,element1,element2);
        System.out.println();

        System.out.println("LinkedList After Swapping");
        for (int i:list){
            System.out.print(i+" ");
        }
    }

    private static void swapping(LinkedList<Integer> list, int element1, int element2) {
        int index1=list.indexOf(element1);
        int index2=list.indexOf(element2);
        if (index1==-1||index2==-1){
            return;
        }
        list.set(index1,element2);
        list.set(index2,element1);
    }
}
