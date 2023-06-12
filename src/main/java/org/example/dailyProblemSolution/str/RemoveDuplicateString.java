package org.example.dailyProblemSolution.str;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str="Shivaa";
        for (int i=0;i<str.length();i++){
            for (int j=i;j<str.length();j++){
                if (str.charAt(i)==0&&str.charAt(j)==0){
                    System.out.println(str);
                }
                else {
                    System.out.println("Hell");
                }
            }
        }
}
}
