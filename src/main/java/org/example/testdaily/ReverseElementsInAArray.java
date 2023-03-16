package org.example.testdaily;
import java.util.Scanner;
public class ReverseElementsInAArray {
    static void rvereseArray(int arr[],int start, int end)
    {
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size)
    {
       for (int i=0;i<size;i++){
           System.out.print(arr[i]+" ");
           System.out.println();
       }
    }
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
        int end=0;
        System.out.println("Enter the end of the array:");
        if (scanner.hasNextInt()) {
             end = scanner.nextInt();
        }
        printArray(arr, size);
        rvereseArray(arr, 0,end );
        System.out.println("Reversed array is ");
        printArray(arr, size);
    }
}
