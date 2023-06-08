package org.example.dailyProblemSolution;

public class ArrayDigitSum {
    public static void digitSum(int nums[],int length){
        int sum=0;
        for (int i=0;i<length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int nums[]={10,45,15,50,60};
        int length=nums.length;
        digitSum(nums,length);
    }
}
