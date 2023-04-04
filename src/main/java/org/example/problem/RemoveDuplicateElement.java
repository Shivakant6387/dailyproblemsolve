package org.example.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5,5};
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
       List<Integer>listout=list.stream().distinct().collect(Collectors.toList());
        System.out.println(listout);
    }
}
