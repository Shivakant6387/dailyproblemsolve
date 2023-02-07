package org.example;



public class MinimumInsertionsToFormAPalindrome {
    static int findMinInsertions(char[]str,int l,int n){
        if (l>n)return Integer.MAX_VALUE;
        if (l==n)return 0;
        if (l==n-1)return (str[l]==str[n])?0:1;
        return (str[l]==str[n])? findMinInsertions(str, l+1, n-1):
                (Integer.min(findMinInsertions(str, l, n-1),findMinInsertions(str, l+1, n))+1);
    }
    public static void main(String[] args) {
    String str="geeks";
        System.out.println(findMinInsertions(str.toCharArray(),0,str.length()-1));

    }
}
