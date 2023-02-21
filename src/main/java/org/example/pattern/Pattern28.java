package org.example.pattern;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int n=scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        patternDisplay(n);
    }
    static void patternDisplay(int n){
        for (int i=1;i<=n;i++){
            int num;
            if (i%2==0){
                num=0;
                for (int j=1;j<=n;j++){
                    System.out.print(num);
                    num=(num==0)?1:0;
                }
            }
            else {
                num=1;
                for (int j=1;j<=n;j++){
                    System.out.print(num);
                    num=(num==0)?1:0;
                }
            }
            System.out.println();
        }
    }
}
