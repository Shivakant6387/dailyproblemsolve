package org.example.DSA.array;

import java.util.HashSet;

public class MakeADistinctDigitArray {
    static void printDistinct(int arr[],int n){
        HashSet<Integer>set=new HashSet<>();
        for (int i=0;i<n;i++){
            if (!set.contains(arr[i])){
                set.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int n=arr.length;
        printDistinct(arr,n);

    }
}
