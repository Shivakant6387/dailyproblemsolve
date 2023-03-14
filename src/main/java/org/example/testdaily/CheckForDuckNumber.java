package org.example.testdaily;

import java.util.Scanner;

public class CheckForDuckNumber {
    public static boolean checkNumber(int number) {
        while (number!=0){
            if (number%10==0)
                return true;
            number=number/10;
        }
        return false;
    }
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int n=scanner.nextInt();
        System.out.println("Enter second number");
        int m=scanner.nextInt();
        if (checkNumber(n)){
            System.out.println(n+"is a Duck number");
        }
        else {
            System.out.println(n+"is not a Duck number");
        }
        if (checkNumber(m)){
            System.out.println(m+"is a Duck number ");
        }
        else {
            System.out.println(m+"is not a Duck number");
        }
    }

}
