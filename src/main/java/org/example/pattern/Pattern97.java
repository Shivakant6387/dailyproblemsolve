package org.example.pattern;

import java.util.Scanner;

public class Pattern97 {
    public static void patternPrint(int rows){
        for (int i=1;i<=(rows*2-1);i++){
            if (i==rows){
                for (int j=1;j<=(rows*2-1);j++){
                    System.out.print("*");
                }
            }
            else {
                for (int k=1;k<=rows-1;k++){
                    System.out.print(" ");
                }
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
