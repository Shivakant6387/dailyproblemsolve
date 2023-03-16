package org.example.testdaily;

import java.util.Scanner;

public class PrintOddIndexElements {
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
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < size; i++) {
            if (arr[i]%2==1){
                System.out.println(arr[i]+"Odd element");
            }
        }
    }
}
