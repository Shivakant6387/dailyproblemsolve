package org.example.DSA.array;

import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4,0,5,0,6};
        int n= arr.length;
        moveAllZeroEnd(arr,n);
    }
    public static void moveAllZeroEnd(int arr[],int n){
        Arrays.sort(arr);
        int j=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                swap(arr,j,i);
                j++;
            }
        }
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int n,int m){
        int temp=arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
}
