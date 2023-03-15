package org.example.pattern;

import java.util.Scanner;

public class Pattern82 {
    static void patternPrint(int n){
        for (int i=1; i<=n; i++)
        {
            // Print star in decreasing order
            for (int j=n; j >=i; j--)
            {
                if( i == 1 || j == i || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Print space in increasing order
            for (int k=1; k<i; k++)
            {
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
