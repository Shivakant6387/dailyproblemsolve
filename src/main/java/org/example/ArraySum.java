package org.example;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,9};
        int sum=0;
        int division=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        division=sum/5;
        System.out.println(sum);
        System.out.println(division);
    }
}
