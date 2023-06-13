package org.example.Demo;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayD {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5,6,4,6};
        int n=arr.length;
        List<Integer>list=new LinkedList<>();
        for(int i=0;i<n;i++){
           list.add(arr[i]);
        }
        List<Integer>listout= list.stream().distinct().collect(Collectors.toList());
        System.out.println(listout);
    }

}
