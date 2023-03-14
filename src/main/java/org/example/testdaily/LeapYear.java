package org.example.testdaily;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter number");
        int n=scanner.nextInt();
        if (n%4==0){
            System.out.println("this number  is leap year");
        }
        else {
            System.out.println("this number is not leap year");
        }
    }
}
