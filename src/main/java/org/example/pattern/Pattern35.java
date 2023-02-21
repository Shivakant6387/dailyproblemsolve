package org.example.pattern;

import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=2*i-1;j++){
                if (i==j){
                    System.out.print(i);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
