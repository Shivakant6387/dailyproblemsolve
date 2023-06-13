package org.example.dailyProblemSolution;

import java.util.HashSet;
import java.util.Set;

public class SortedArray {
    public static void main(String[] args) {
        Integer nums[]={1,3,2,4,5,6,7,5,9};
        Set<Integer>set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
    }
}
