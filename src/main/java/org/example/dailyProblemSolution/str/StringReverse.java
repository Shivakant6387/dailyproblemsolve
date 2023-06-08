package org.example.dailyProblemSolution.str;

public class StringReverse {
    public static void strReverse(String str){
        String str2=" ";
        char ch;
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            str2=ch+str2;
        }
        System.out.println(str2);
    }

    public static void main(String[] args) {
        String str="Shiva";
        strReverse(str);
    }
}
