package org.example.testdaily;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("can you enter of the value ");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int sum=0;
        if (n%2==0 && m%2==0){
            sum=n+m;
            System.out.println(sum);
        }
        else {
            System.out.println("this value is not even show this is not sum");
        }
    }
}
