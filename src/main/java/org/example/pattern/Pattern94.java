package org.example.pattern;

import java.util.Scanner;

public class Pattern94 {
    public static void patternPrint(int rows){
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows;j++){
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
