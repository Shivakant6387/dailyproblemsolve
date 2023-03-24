package org.example.pattern;

import java.util.Scanner;

public class Pattern85 {
public static void patternPrint(int rows){
    for (int i=rows; i>=1; i--)
    {
        // Print star in decreasing order
        for (int j=1; j <=(i * 2) -1; j++)
        {
            if( j == 1 || j == (i * 2) -1 || i == rows)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
        // Print space in increasing order
        for (int k = rows; k >= i; k--)
        {
            System.out.print(" ");
        }

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
