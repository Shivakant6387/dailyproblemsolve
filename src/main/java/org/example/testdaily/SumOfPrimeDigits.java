package org.example.testdaily;

import java.util.Scanner;

public class SumOfPrimeDigits {
    static void checkPrimeSum(int n ,int p){
        int i,m=0,flag=0 ,d=0;
        int sum=0;
        m=n/2;
        d=p/2;
        if(n==0||n==1 && p==0 || p==1){
            System.out.println(n+p+" is not prime number");
        }else {
            for (i = 2; i <= m; i++) {
                    if (n % i == 0 && p % i == 0) {
                        System.out.println(n+p+" is not prime number");
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    sum = n + p;
                    System.out.println(sum + " is prime number");

            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter first of the value ");
        int n=scanner.nextInt();
        System.out.println("Can you enter second of the value");
        int m=scanner.nextInt();
        checkPrimeSum(n,m);
    }
}
