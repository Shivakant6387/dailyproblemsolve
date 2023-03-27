package org.example.treeproblem;

import java.util.Arrays;

public class PSolve {
    public static void main(String[] args) {
        int  arr[]={1,4,7,8,5,4,2,3};
        Arrays.stream(arr).filter(value -> value%2==0).forEach(System.out::println);
    }
}
