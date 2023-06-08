package org.example.dailyProblemSolution;

public class SwapTwoNum {
    public static void swapTwoNum(int num1,int num2){
        num2=num2+num1;
        num1=num2-num1;
        num2=num2-num1;
        System.out.println("After swapping"+num1+"and "+num2);
    }
    public static void main(String[] args) {
        int num1=101;
        int num2=102;
        swapTwoNum(num1,num2);
    }
}
