package org.example;

import java.util.Arrays;

public class Countnumberofsubstringswithexactlykdistinctcharacters {
    public static void main(String[] args) {
        Countnumberofsubstringswithexactlykdistinctcharacters obj=new Countnumberofsubstringswithexactlykdistinctcharacters();
        String str="abcbaa";
        int k=3;
        System.out.println(obj.countKDist(str,k));
    }
    int countKDist(String str,int k){
        int res=0;
        int n=str.length();
        boolean seen[]=new boolean[26];
        for (int i=0;i<n;i++){
            int distCount=0;
            Arrays.fill(seen,false);
            for (int j=i;j<n;j++){
                if (!seen[str.charAt(j)-'a'])
                    distCount++;
                seen[str.charAt(j)-'a']=true;
                if (distCount==k)
                    res++;
            }
        }
        return res;
    }
}
