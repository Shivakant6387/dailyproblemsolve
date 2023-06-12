package org.example.dailyProblemSolution.array;
//How do you find the second largest number in an array in Java?
public class SecondLargestElements {
    public static int findSecondLargest(int array[]){
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for (int i:array){
            if (i>highest){
                secondHighest=highest;
                highest=i;
            } else if (i>secondHighest) {
                secondHighest=i;
            }
        }
        return secondHighest;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        System.out.println(findSecondLargest(array));
    }
}
