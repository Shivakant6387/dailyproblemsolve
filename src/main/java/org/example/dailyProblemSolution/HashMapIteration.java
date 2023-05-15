package org.example.dailyProblemSolution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
       HashMap<Integer,String>map=new HashMap<>();
       map.put(2,"Shivakant");
       map.put(25,"Sakshi");
       map.put(12,"HashMap");
        System.out.println(map.size());
        System.out.println("While loop:");
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry me=(Map.Entry)iterator.next();
            System.out.println("Key is"+me.getKey()+"value is"+me.getValue());
        }
        System.out.println("For loop");
        for (Map.Entry me2:map.entrySet()){
            System.out.println("Key is: "+me2.getKey()+"Value is:"+me2.getValue());
        }
    }
}
