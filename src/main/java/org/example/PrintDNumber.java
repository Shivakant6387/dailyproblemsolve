package org.example;

import java.util.*;
import java.util.Arrays;

public class PrintDNumber {
    public static void main(String[]args) {
        int arr[]={5,10,15,5,90,90};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
