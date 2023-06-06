package org.example.DSA.array;

import java.util.Arrays;

public class ReorderAnArrayAccordingTogivenIndexes {
    static int nums[]=new int []{50,40,70,60,90};
    static int index[]=new int[]{3,0,4,1,2};
    static void reOrder(){
        int[] temp=new int[nums.length];
        for (int i=0;i<nums.length;i++)
            temp[index[i]]=nums[i];
        for (int i=0;i<nums.length;i++){
            nums[i]=temp[i];
            index[i]=i;
        }
    }
    public static void main(String[] args) {
        reOrder();
        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(nums));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));
    }
}
