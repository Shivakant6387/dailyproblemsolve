package org.example;

import java.util.Arrays;

public class TheStockSpanProblem {
    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);
    }
    static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
    static void calculateSpan(int price[], int n, int S[])
    {
        S[0] = 1;

        // Calculate span value of remaining days by
        // linearly checking previous days
        for (int i = 1; i < n; i++) {
            S[i] = 1; // Initialize span value

            // Traverse left while the next element on left
            // is smaller than price[i]
            for (int j = i - 1;
                 (j >= 0) && (price[i] >= price[j]); j--)
                S[i]++;
        }
    }
}
