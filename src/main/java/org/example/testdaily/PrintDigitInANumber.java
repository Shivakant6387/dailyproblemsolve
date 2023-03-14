package org.example.testdaily;

import java.util.Scanner;

public class PrintDigitInANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter value");
        int n=scanner.nextInt();
        String str=String.valueOf(n);
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
