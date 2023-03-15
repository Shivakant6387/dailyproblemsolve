package org.example.pattern;

import java.util.Scanner;

public class Pattern80 {
    static void patternPrint(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j==1||j==i||i==n)
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
