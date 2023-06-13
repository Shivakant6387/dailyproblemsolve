package org.example.Demo;

public class FindAPeakElementWhichIsNotSmallerThanItsNeighbours {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 ,89};
        int n = arr.length;
        System.out.print("Index of a peak point is " + findPeak(arr, n));
    }
    static int findPeak(int arr[],int n){
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }
}
