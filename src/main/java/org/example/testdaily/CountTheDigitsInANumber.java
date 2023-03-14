package org.example.testdaily;

import java.util.Scanner;

public class CountTheDigitsInANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter of the number");
        int n=scanner.nextInt();
        int count =0;
        while (n!=0){
            n/=10;
            ++count;
        }
        System.out.println("Count Number of Digit "+count);
    }
}
