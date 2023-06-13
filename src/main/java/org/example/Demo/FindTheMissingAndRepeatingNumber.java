package org.example.Demo;

import java.util.Arrays;

public class FindTheMissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
    public static void printTwoElements(int[] arr, int n)
    {
        Arrays.sort(arr);
        System.out.print("The repeating element is ");
        for (int i=0;i<n;i++){
            if (arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
        System.out.print("and the missing element is ");
        for (int i=1;i<=n;i++){
            if (i!=arr[i-1]){
                System.out.print(i);
                break;
            }
        }
    }
}
