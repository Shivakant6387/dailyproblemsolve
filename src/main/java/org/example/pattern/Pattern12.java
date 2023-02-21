package org.example.pattern;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
