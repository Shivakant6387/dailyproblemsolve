package org.example.dailyProblemSolution;
//Display sum of both array numbers in one new array?
public class TwoArraySum {
    public static void twoArraySum(int nums1[],int nums2[]){
        int sumArray[]=new int[nums1.length];
        for (int i=0;i<nums1.length;i++){
            sumArray[i]=nums1[i]+nums2[i];
        }
        for (int i=0;i<sumArray.length;i++){
            System.out.print(sumArray[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums1={10,24,45,12,1,87,6};
        int[] nums2={123,92,6,10,11,4,16};
        twoArraySum(nums1,nums2);
    }
}
