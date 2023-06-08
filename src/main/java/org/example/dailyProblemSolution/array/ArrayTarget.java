package org.example.dailyProblemSolution.array;

public class ArrayTarget {
    public static void main(String[] args) {
    int nums[]={12,23,34,45,56,60};
    int target=60;
        System.out.println(search(nums,target));
    }
    public static int  search(int nums[],int target){
        int num=nums.length;
        int i=0;
        for ( i=0;i<num;i++)
            if (nums[i]==target)
                break;
        return nums[i];
    }
}
