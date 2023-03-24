package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PRemoveA {
    public static void main(String[] args) {
        int arr[]={35,35,45,45,60,60};
        TreeSet<Integer> set=new TreeSet<>();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
