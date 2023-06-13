package org.example.Demo;
public class LongestDistinctcharactersinstring {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
        int len = longestUniqueSubStr(str);
        System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
    }
    public static Boolean areDistinct(String str,int i,int j){
        boolean[]visited=new boolean[26];
        for (int k=0;k<=j;k++){
            if (visited[str.charAt(k)-'a']==true)
                return false;
            visited[str.charAt(k)-'a']=true;
        }
        return true;
    }
    public static int longestUniqueSubStr(String str){
        int n=str.length();
        int res=0;
        for (int i=0;i<n;i++)
            for (int j=i;j<n;j++)
                if (areDistinct(str,i,j))
                    res=Math.max(res,j-i+1);
        return res;
    }
}
