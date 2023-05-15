package org.example.dailyProblemSolution;

public class ReverseStringWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        String str="Shiva";
        String string=" ";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            string=ch+string;
        }
        System.out.println(string);
    }
}
