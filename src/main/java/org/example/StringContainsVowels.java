package org.example;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello"));
    }
    public static boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
