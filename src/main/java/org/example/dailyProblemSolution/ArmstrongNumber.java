package org.example.dailyProblemSolution;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 341, originalNumber, remainder, result = 0;
        originalNumber=number;
        while (originalNumber != 0) {
            remainder=originalNumber%10;
            result+=Math.pow(remainder,3);
            originalNumber/=10;
        }
        if (result==number)
            System.out.println("Armstrong number is: "+number);
        else {
            System.out.println("Armstrong number is not :"+number);
        }
    }
}