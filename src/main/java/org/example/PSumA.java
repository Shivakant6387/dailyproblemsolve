package org.example;

public class PSumA {
    public static void main(String[] args) {
        int arr[]={10,30,20,10};
        int sum=arr[0];
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
