package org.example.DSA.array;

import java.util.Arrays;

public class RearrangeArrayEvenpositionedAreGreaterThanOdd {
    public static void assign(int arr[],int n){
        Arrays.sort(arr);
        int ans[]=new int[n];
        int p=0,q=n-1;
        for (int i=0;i<n;i++){
            if ((i+1)%2==0)
                ans[i]=arr[q--];
            else
                ans[i]=arr[p++];
        }
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,2,5};
        int n=arr.length;
        assign(arr,n);
    }
}
