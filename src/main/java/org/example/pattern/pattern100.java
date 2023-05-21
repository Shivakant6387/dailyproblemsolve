package org.example.pattern;

import java.util.Scanner;

public class pattern100 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int spaces=0;
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            System.out.println();
            spaces++;
            star--;
        }

    }
}
