package org.example.DSA.array;

import java.util.Arrays;

public class ArraySum {
    public static int  sumArray(int arr[],int n){
        int sum=0;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,5};
        int n=arr.length;
        System.out.println(sumArray(arr,n));
    }
}
