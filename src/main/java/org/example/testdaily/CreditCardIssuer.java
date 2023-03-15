package org.example.testdaily;

import java.util.Scanner;

public class CreditCardIssuer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter of the number");
        int n=scanner.nextInt();
        if (n>=400 && n<=600){
            System.out.println("Silver Card");
        } else if (n>=600 &&n<=800) {
            System.out.println("Gold Card");
        } else if (n>=800 && n<=850) {
            System.out.println("Platinum card");
        }
        else {
            System.out.println("This card is not available");
        }
    }
}
