package org.example.dailyProblemSolution.array;

public class SecondLargestNumber {
    public static void secondLargestNumber(int arr[]){
        int secondLargest=0;
        int largestNumber=0;
        int thirdLargestNumber=0;
        for (int i=0;i<arr.length;i++){
            largestNumber=arr[i];
        }
        System.out.println("Largest number is :"+largestNumber);
        for (int i=0;i<arr.length-1;i++){
            secondLargest=arr[i];
        }
        System.out.println("Second largest number is :"+secondLargest);
        for (int i=0;i<arr.length-2;i++){
            thirdLargestNumber=arr[i];
        }
        System.out.println("Third largest number is :"+thirdLargestNumber);
    }
    public static void main(String[] args) {
        int arr[]={10,30,50,60};
        secondLargestNumber(arr);
    }
}
