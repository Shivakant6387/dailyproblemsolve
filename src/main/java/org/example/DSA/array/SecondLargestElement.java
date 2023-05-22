package org.example.DSA.array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,6,7,8,9,89,78,79,99,100};
        int n=arr.length;
        printSecondLargestElement(arr,n);
    }
    public static void printSecondLargestElement(int arr[],int n){
        Arrays.sort(arr);
        int second=0;
        for (int i=1;i<n-1;i++){
            second=arr[i];

        }
        System.out.println(" the second largest elements: "+second);
    }
}
