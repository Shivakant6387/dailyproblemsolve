package org.example.DSA.array;

import java.util.Arrays;
import java.util.Collections;

public class Array_Rotate2 {
    public static void leftRotate(Integer arr[],int k,int n){
        Collections.rotate(Arrays.asList(arr),n-k);
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Integer arr[]={1,3,5,7,9};
        int n=arr.length;
        int k=2;
        leftRotate(arr,k,n);
    }

}
