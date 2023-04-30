package org.example.problem;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,2,3,2,1,9,5,56,7,8,9,0,0,7,99));
        Integer max = list.stream().sorted().distinct().max(Integer::compare).get();
        System.out.println(max);
    }
}
