package org.example.DSA.array;

import java.util.Arrays;

public class SortWave {
    static void swap(int nums[],int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
   static void  SortInWave(int nums[],int length){
        Arrays.sort(nums);
        for (int i=0;i<length-1;i+=2)
            swap(nums,i,i+1);
    }
    public static void main(String[] args) {
        int nums[]={10,90,49,2,1,5,23};
        int length=nums.length;
        SortInWave(nums,length);
        for (int i:nums)
            System.out.print(i+" ");
    }

}
