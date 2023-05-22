package org.example.DSA.array;

import java.util.Arrays;

public class FindTheThreeLargestNumber {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,89,9};
    int n=arr.length;
    printLargestElement(arr,n);
    }
    public static void printLargestElement(int arr[],int n){
        Arrays.sort(arr);
        System.out.println("first ="+arr[n-1]);
        System.out.println("second ="+arr[n-2]);
        System.out.println("third ="+arr[n-3]);
    }
}
