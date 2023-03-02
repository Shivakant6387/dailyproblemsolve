package org.example;

import java.util.Arrays;

public class Kthsmallestelement {
    public static void main(String[] args) {

        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int K = 2;

        // Function call
        System.out.print("K'th smallest element is " + kthSmallest(arr, K));    }
    public static int kthSmallest(Integer[] arr, int K)
    {
        Arrays.sort(arr);
        return arr[K-1];
    }
}
