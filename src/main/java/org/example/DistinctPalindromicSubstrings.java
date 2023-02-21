package org.example;
import java.util.Map;
import java.util.TreeMap;
public class DistinctPalindromicSubstrings {
    public static void main(String[] args) {
        String str="abaaa";
        palindromeSubStrs(str);
    }
    private static void palindromeSubStrs(String str) {
        TreeMap<String,Integer>map=new TreeMap<>();
        int n=str.length();
        int [][] arr=new int[2][n+1];
        str="@"+str+"#";
        for (int j=0;j<=1;j++){
            int rp=0;
            arr[j][0]=0;
            int i=1;
            while (i<=n){
                while (str.charAt(i-rp-1)==str.charAt(i+j+rp))
                    rp++;
                arr[j][i]=rp;
                int k=1;
                while ((arr[j][i-k]!=rp-k)&&(k<rp)){
                    arr[j][i+k]=Math.min(arr[j][i-k],rp-k);
                    k++;
                }
                rp=Math.max(rp-k,0);
                i+=k;
            }
        }
        str=str.substring(1,str.length()-1);
        map.put(str.substring(0,1),1);
        for (int i=0;i<n;i++){
            for (int j=0;j<=1;j++){
                for (int rp=arr[j][i];rp>0;rp--)
                    map.put(str.substring(i-rp-1,i-rp-1+2*rp+j),1);
                map.put(str.substring(i,i+1),1);
            }
            System.out.println("Below are "+(map.size())+"palindrome sub-strings");
            for (Map.Entry<String, Integer> ii:map.entrySet())
                System.out.println(ii.getKey());
        }
    }
}
