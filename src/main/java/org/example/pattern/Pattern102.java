package org.example.pattern;

import java.util.Scanner;

public class Pattern102 {
    static void printStar(int n){
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("*\t");
            }
            for (int k=1;k<=i*2-2;k++){
                System.out.print("\t");
            }
            for (int l=i;l<=n;l++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter number");
        int n=scanner.nextInt();
        System.out.println("**print star **");
        printStar(n);
    }
}
