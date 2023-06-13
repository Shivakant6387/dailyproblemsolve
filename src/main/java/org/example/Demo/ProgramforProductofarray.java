package org.example.Demo;

public class ProgramforProductofarray {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 7, 6, 1};
        System.out.println(product(arr));
    }
    static int product(int arr[]){
        int product=1;
        int i=0;
        int j=arr.length-1;
        while (i<j){
            product*=arr[i]*arr[j];
            i++;
            j--;
        }
        if (i==j){
            product*=arr[i];
        }
        return product;
    }
}
