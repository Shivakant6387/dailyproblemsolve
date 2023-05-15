package org.example.dailyProblemSolution;

public class ReverseStringWithoutUsingInbuiltFunction2 {
    public static void main(String[] args) {
        String str="Shiva";
        char[] ch=str.toCharArray();
        for (int i=ch.length-1; i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
