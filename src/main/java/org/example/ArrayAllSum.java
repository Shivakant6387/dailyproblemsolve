package org.example;
import java.util.Arrays;

public class ArrayAllSum {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,6,1};
        System.out.println(sum(arr));
    }
    static int sum(int arr[]){
        int sum=0;
        System.out.println(Arrays.stream(arr).sum());

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
