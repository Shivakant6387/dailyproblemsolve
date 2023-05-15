package org.example.dailyProblemSolution;

import java.util.ArrayList;
import java.util.Iterator;
public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

            list.add("20");
            list.add("30");
            list.add("40");

        System.out.println(list.size());
        System.out.println("While loop: ");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Advance For loop");
        for (Object obj:list){
            System.out.println(obj);
        }
        System.out.println("For loop");
        for (int i=0;i<=list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
