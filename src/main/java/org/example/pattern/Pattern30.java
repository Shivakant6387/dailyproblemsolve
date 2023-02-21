package org.example.pattern;

import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){
                    System.out.print(i);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
