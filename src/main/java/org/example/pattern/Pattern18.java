package org.example.pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){

        for (int i = 1; i <= n; i++)
        {
            //Printing rows-i spaces at the beginning of each row

            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            //Printing 1 to i value at the end of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
