package org.example;

public class ArrayMin {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,6,1};
        System.out.println(minSum(arr));
    }
    static int minSum(int arr[]){
        int res=arr[0];
        for (int i=0;i<arr.length;i++){
           if (arr[i]<res)
            res=arr[i];
        }
        return res;
    }
}