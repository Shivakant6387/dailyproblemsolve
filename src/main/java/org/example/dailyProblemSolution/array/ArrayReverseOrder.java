package org.example.dailyProblemSolution.array;

public class ArrayReverseOrder {
    public static void reverseOrder(int nums[],int length){
        for (int i=length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={10,45,30,50,20};
        int length=nums.length;
        reverseOrder(nums,length);
    }
}
