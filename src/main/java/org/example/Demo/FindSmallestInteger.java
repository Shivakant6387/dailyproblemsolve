package org.example.Demo;

import java.util.Arrays;

public class FindSmallestInteger {
    static int findSmallest(int arr[],int n){
        int res=1;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if (arr[i]>res){
                return res;
            }
            else {
                res+=arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println(findSmallest(arr1, n1));

    }
}
