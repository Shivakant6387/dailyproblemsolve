package org.example.dailyProblemSolution;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("Enter x and y");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        y= scanner.nextInt();
        System.out.println("Before Swapping "+x+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping"+x+y);
    }
}
