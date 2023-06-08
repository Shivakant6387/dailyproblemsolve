package org.example.dailyProblemSolution.str;

public class VowelIsPresentOrNot {
    public static boolean vowelPresentOrNot(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        String str="Sakshi";
        System.out.println(vowelPresentOrNot(str));
    }
}
