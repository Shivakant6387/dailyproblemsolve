package org.example;

import java.util.Arrays;

public class IsomorphicStrings {
    static int size = 256;
    // Function returns true if str1 and str2 are isomorphic
    static String areIsomorphic(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        //Length of both strings must be same for one to
        //one correspondence
        if (m !=n)
            return "False";
        //to mark visited characters in str2
        Boolean []marked = new Boolean[size];
        Arrays.fill(marked,Boolean.FALSE);
        // To store mapping of every character from str1 to
        // that of str2. Initialize all entries of map as
        // -1.
        int []map=new int[size];
        Arrays.fill(map,-1);
        //process all characters one by on
        for (int i=0;i<n;i++){
        if(map[str1.charAt(i)]==-1){
            if (marked[str2.charAt(i)]==true)
                return "False";
            //mark current character of str2 as visited
            marked[str2.charAt(i)]=true;
            //store mapping of current characters
            map[str1.charAt(i)]=str2.charAt(i);
        }
        // If this is not first appearance of current
        // character in str1, then check if previous
        // appearance mapped to same character of str2
        else if (map[str1.charAt(i)] != str2.charAt(i))
            return "False";
        }

        return "True";
    }
    public static void main(String[] args) {
        String res = areIsomorphic("aab", "xxy");
        System.out.println(res);
    }
}
