package org.example;

public class Solution {
    public static void main(String[] args) {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word="geeks";
        String arr[]=str.split(" ");

        int count=0;
        for (int i=0;i< arr.length;i++){
            if (word.equals(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }

}
