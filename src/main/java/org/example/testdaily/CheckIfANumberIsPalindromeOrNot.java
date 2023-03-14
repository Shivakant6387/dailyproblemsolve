package org.example.testdaily;

import java.util.Scanner;

public class CheckIfANumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter of the number");
        int n=scanner.nextInt();
        int r,sum=0,temp;
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
            System.out.println("This number is palindrome");
        else
            System.out.println("This number is not palindrome");
    }
}
