package org.example.testdaily;

import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter of the value");
        int n=scanner.nextInt();
        int digit,sum=0;
        while (n>0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
