package org.example.Demo;

public class LongestAlternatingSubSequence {
    public static void main(String[] args) {
        int arr[]={10,22,9,33,49,50,31,60};
        int n=arr.length;
        System.out.println(LAS(arr,n));
    }
    static int LAS(int arr[],int n){
        int inc=1;
        int dec=1;
        for (int i=1;i<n;i++){
            if (arr[i]>arr[i-1]){
                inc=dec+1;
            } else if (arr[i]<arr[i-1]) {
                dec=inc+1;
            }
        }
        return Math.max(inc,dec);
    }
}
