package org.example.DSA.linkedList;

import java.util.*;

public class RemoveDuplicateElement {
    public static void removeDuplicateElements(LinkedList<Integer>list){
        Set<Integer>set=new HashSet<>();
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            if (!set.add((Integer) iterator.next())){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,8,7,7,6,5,4,3,2,1));
        removeDuplicateElements(list);
    }
}
