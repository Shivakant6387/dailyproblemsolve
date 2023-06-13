package org.example.Demo;

import java.util.*;
public class ReverseArray {
    static void reverse(int arr[]){
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
            list.add(arr[i]);
            list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
            list.stream().sorted().skip(list.get(3)).forEach(System.out::println);


    }
}
