package org.example.dailyProblemSolution.array;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int []arr={13,12,15,36,56,67,98,87,99};
        Arrays.sort(arr);
        int largest=0;
        int secondLargest=0;
        System.out.println("The given array is :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for (int j=0;j<arr.length;j++){
            if (arr[j]>largest){
                secondLargest=largest;
                largest=arr[j];
            } else if (arr[j]>secondLargest) {
                secondLargest=arr[j];
            }
        }
        System.out.println("\nSecond largest number is :"+secondLargest);
        System.out.println("Largest number is :"+largest);
    }
}
