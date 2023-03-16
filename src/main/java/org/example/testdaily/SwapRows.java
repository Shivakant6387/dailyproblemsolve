package org.example.testdaily;

import java.util.Scanner;

public class SwapRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = 0;
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            int temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
