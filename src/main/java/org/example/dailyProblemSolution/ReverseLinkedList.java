package org.example.dailyProblemSolution;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        LinkedList<Integer>linkedList=new LinkedList<>();
        list.descendingIterator().forEachRemaining(linkedList::add);
        System.out.println(linkedList);
    }
}
