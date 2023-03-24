package org.example.pattern;

import java.util.Scanner;

public class Pattern88 {
    public static void patternPrint(int rows){
        for (int i = 1; i <= rows; i++)
        {
            // Print space in decreasing order
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k = 1; k <= i; k++)
            {
                if( k == 1 || k == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows-1; i++)
        {
            // Print space in increasing order
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k = rows-1; k >= i; k--)
            {
                if( k == rows-1 || k == i )
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
