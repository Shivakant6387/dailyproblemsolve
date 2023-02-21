package org.example.pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=n;i>=1;i--){
            for (int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
