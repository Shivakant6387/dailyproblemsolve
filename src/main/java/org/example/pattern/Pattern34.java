package org.example.pattern;

import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        int num=1;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                int value=num+i-1;
                for (int j=1;j<=i;j++){
                    value--;
                    num++;
                }
            }
            else {
                for (int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
