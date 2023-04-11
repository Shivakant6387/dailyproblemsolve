package org.example;

public class ArrayOddNum {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 6, 7, 1};
        oddAllNum(arr);

    }
    static void oddAllNum(int arr[]){
        int n=arr.length;
        int sum=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
