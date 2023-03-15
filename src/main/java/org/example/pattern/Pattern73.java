package org.example.pattern;

import java.util.Scanner;

public class Pattern73 {
    static void patternPrint(int n){
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=1;i<=n;i++){
        for (int j=n;j>i;j--){
            System.out.print("*");
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
