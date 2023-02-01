package org.example;

import java.util.ArrayList;

public class Equal0and2 {
    static long getSubStringWithEqual012(String s){
        ArrayList<String>arrayList=new ArrayList<>();
        int n=s.length();
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                String s1=" ";
                for (int k=i;k<=j;k++){
                    s1+=s.charAt(k);
                }
                arrayList.add(s1);
            }
        }
        int count=0;
        int countZero,countOnes,countTwo;
        for (int i=0;i<arrayList.size();i++){
            countZero=0;
            countOnes=0;
            countTwo=0;
            String curs=arrayList.get(i);
            for (int j=0;j<curs.length();j++){
                if (curs.charAt(j)==0)
                    countZero++;
                if (curs.charAt(j)=='1')
                    countOnes++;
                if (curs.charAt(j)=='2')
                    countTwo++;
            }
            if (countZero==countOnes && countOnes==countTwo){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    String str="0102010";
        System.out.println(getSubStringWithEqual012(str));
    }
}

