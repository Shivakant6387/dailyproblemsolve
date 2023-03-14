package org.example.testdaily;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumOfMultiplesOf3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you enter multiple value");
        int mul=scanner.nextInt();
        System.out.println("Can you enter of the number");
        int n=scanner.nextInt();

        System.out.println( calculate_sum(mul,n));
    }
    static int calculate_sum(int a, int N) {


        int m = N / a;

        int sum = m * (m + 1) / 2;


        int ans = a * sum;

        return ans;
    }
}
