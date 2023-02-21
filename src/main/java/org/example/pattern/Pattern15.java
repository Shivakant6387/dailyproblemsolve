package org.example.pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=1;i<=n;i++){
            for (int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
