package org.example.DSA.array;

import java.util.Arrays;

public class ThirdElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,45,5,6,76,7,87,9};
        int n=arr.length;
        printThirdElement(arr,n);
    }
    public static void printThirdElement(int arr[],int n){
        Arrays.sort(arr);
        int check=0,count=1;
        for (int i=1;i<=n;i++){
            if (count<4){
                if (check!=arr[n-i]){
                    System.out.print(arr[n-i]+" ");
                    check=arr[n-i];
                    count++;
                }
            }
            else
                break;
        }
    }
}
