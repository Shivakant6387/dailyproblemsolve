package org.example.Demo;

public class Checkiftwostringsarekanagramsornot {

    static final int MAX_CHAR=26;
    //function to check that string is k-anagram or not
    static boolean areKAnagrams(String str1,String str2,int k){
        //if both Strings are not of equal
        //length then return false
        int n=str1.length();
        if (str2.length()!=n)
            return false;
        int []count1=new int[MAX_CHAR];
        int []count2=new int[MAX_CHAR];
        int count = 0;
        //store the occurrence of all characters
        //in a hash array
        for (int i=0;i<n;i++)
            count1[str1.charAt(i)-'a']++;
        for (int i=0;i<n;i++)
            count2[str2.charAt(i)-'a']++;
        //count number of characters that are different in both strings
        for (int i=0;i<MAX_CHAR;i++)
            if (count1[i]>count2[i])
                count=count+Math.abs(count1[i]-count2[i]);
        //return true if count is less than or equal to k
        return (count<=k);

    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;
        if (areKAnagrams(str1, str2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
