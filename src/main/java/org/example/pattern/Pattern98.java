package org.example.pattern;

import java.util.Scanner;

public class Pattern98 {
    public static void patternPrint(int rows){
        for (int i = 1; i <= rows * 2 - 1; i++)
        {
            if (i == 1 || i == rows || i == rows * 2 - 1)
            {
                for (int j = 1; j <= rows; j++)
                {
                    if (j == 1 || j == rows)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            else
            {
                for (int k = 1; k <= rows; k++)
                {
                    if (k == 1 || k == rows)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
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
