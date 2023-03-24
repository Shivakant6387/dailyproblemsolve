package org.example.pattern;

import java.util.Scanner;

public class Pattern87 {
    public static void patternPrint(int rows){
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=1; i<=rows-1; i++)
        {
            // Print star in decreasing order
            for (int j = rows-1; j >= i; j--)
            {
                if( j == rows-1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Print space in increasing order
            for (int k = 1; k < i; k++)
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
