package org.example.pattern;

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(1);
            }
            for (int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
