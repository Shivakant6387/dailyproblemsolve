package org.example;

import java.util.HashSet;
import java.util.Set;

public class Remove {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,2,5,6,3,54};
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
