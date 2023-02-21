package org.example;

public class ArrayMax {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,6,1,4,5,8,9,2};
        System.out.println(arrMax(arr));
    }
    static int arrMax(int arr[]){
        int res=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>res)
                res=arr[i];
        }
        return res;
    }
}
