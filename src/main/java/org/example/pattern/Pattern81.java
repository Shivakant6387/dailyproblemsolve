package org.example.pattern;

import java.util.Scanner;

public class Pattern81 {
    public static void patternPrint(int n){
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if (k==1||k==i||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        patternPrint(rows);
    }
}
