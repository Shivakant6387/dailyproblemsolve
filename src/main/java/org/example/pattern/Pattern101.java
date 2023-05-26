package org.example.pattern;

import java.util.Scanner;

public class Pattern101 {
    static void starPrint(int n){
        int nspaces = n / 2;
        int nstars = 1;
    for (int i=1;i<=n;i++) {
        for (int j = 1; j <=nspaces; j++) {
            System.out.print("\t");
        }
        for (int k=1;k<=nstars;k++){
            System.out.print("*\t");
        }
        if (i<=n/2){
            nspaces--;
            nstars+=2;
        }else {
            nspaces++;
            nstars-=2;
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int n=scanner.nextInt();
        System.out.println("print star");
        starPrint(n);
    }
}
