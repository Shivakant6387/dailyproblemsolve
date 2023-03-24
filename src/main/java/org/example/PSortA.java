package org.example;

import java.util.Arrays;

public class PSortA {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 6, 4, 8, 7};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
