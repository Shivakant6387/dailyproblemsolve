package org.example.testdaily;

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        long n, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextLong();
        int i=1;
        while (i<=n/2){
            if (n%i==0){
                sum+=i;
            }
            i++;
        }
        if (sum==n){
            System.out.println(n+"is a prefect number");
        }
        else {
            System.out.println(n+"is not a prefect number");
        }
    }
}
