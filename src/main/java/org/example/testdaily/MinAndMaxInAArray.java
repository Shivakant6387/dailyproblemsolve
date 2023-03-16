package org.example.testdaily;
import java.util.Scanner;
public class MinAndMaxInAArray {
    public static int max(int [] array) {
        int max = 0;
        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int min(int [] array) {
        int min = array[0];
        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = 0;
        int max = 0;
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
        System.out.println("Min element="+min(arr));
        System.out.println("Max element="+max(arr));
    }
}
