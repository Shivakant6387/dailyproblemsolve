package org.example.testdaily;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number of the even or odd");
        int n=scanner.nextInt();

        if (n%2==0){
            System.out.println("This number is even");
        }
        else {
            System.out.println("This number is odd");
        }
    }
}
