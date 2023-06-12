package org.example.dailyProblemSolution.str;
//How do you remove all occurrences of a given character from an input string in Java?
public class Occurrences {
    public static void main(String[] args) {
        String str="abcdABCDabcdABCD";
        str=str.replace("a","");
        System.out.println(str);
    }
}
