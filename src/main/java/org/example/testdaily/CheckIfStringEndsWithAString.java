package org.example.testdaily;

public class CheckIfStringEndsWithAString {
    public static void main(String[] args) {
        String  str="Welcome to join my journey";
        boolean b=str.endsWith("journey");
        boolean b1=str.startsWith("Welcome");
        System.out.println(b1+""+b);
    }
}
