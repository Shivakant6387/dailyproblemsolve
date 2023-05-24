package org.example.DSA.array;

import java.util.Stack;

public class LeadersInAnArray {
    /* Java Function to print leaders in an array */
    static void printLeaders(int arr[], int size)
    {
        /* create stack to store leaders*/
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[size - 1]);

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }

        /* print stack elements*/
        /* run loop till stack is not empty*/
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    /* Driver program to test above function*/
    public static void main(String[] args)
    {
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        printLeaders(arr, n);
    }
}
