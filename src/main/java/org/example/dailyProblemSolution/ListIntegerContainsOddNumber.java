package org.example.dailyProblemSolution;

import java.util.Collections;
import java.util.List;

public class ListIntegerContainsOddNumber {
    public static boolean printOnlyOdd(List<Integer>list){
        for (int num:list){
            if (num%2==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
    int num=31;
        System.out.println(printOnlyOdd(Collections.singletonList(num)));
    }
}
