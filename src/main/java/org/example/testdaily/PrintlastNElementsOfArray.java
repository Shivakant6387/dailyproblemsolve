package org.example.testdaily;

import java.util.Scanner;

public class PrintlastNElementsOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = 0,index=0,i;
        int last =0;
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for ( i = 0; i < size; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }
        System.out.println("Enter the last of the array:");
        if (scanner.hasNextInt()) {
            last = scanner.nextInt();
        }
        for (i=0;i<arr.length;i++){
            if (arr[i]==last){
                index=i;
                break;
            }
        }
        System.out.print("Last n items from an array is: ");
        for (i=index;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
