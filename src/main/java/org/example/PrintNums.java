package org.example;

import java.util.Scanner;

public class PrintNums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
    while ( i<n){
        i=i+1;
        System.out.println(i);
    }
    }
}
