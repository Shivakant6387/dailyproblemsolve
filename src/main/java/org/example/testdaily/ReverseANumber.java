package org.example.testdaily;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter number");
        int n=scanner.nextInt();
        int reverse=0;
        while (n!=0){
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println("the reverse of the number is"+reverse);
    }
}
