package org.example.testdaily;

public class IntegerToBinary {
    public static void printBinary(int []arr,int id){
        for (int i=id-1;i>=0;i--)
            System.out.print(arr[i]+"");
    }
    public static void decimalToBinary(int num){
        int arr[]=new int[35];
        int id=0;
        while (num>0){
            arr[id++]=num%2;
            num=num/2;
        }
        printBinary(arr,id);
    }
    public static void main(String[] args) {
        int num=5;
        decimalToBinary(num);
    }
}
