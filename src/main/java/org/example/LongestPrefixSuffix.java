package org.example;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String str="aabcdaabc";
        System.out.println(longestPrefixSuffix(str));
    }
    static int longestPrefixSuffix(String str){
        int n=str.length();
        if (n<2){
            return 0;
        }
        int len=0;
        int i=(n+1)/2;
        while (i<n){
            if (str.charAt(i)==str.charAt(len)){
                ++len;
                ++i;
            }
            else {
                i=i-len+1;
                len=0;
            }
        }
        return len;
    }
}
