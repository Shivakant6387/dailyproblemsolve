package org.example.Demo;

import java.util.Arrays;

public class PSLA {
    public static void main(String[] args) {
        int arr[]={30,20,80,10,60,90,80,10};
        int ans=arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]>ans)
            ans=arr[i];
        }
        System.out.println("max"+ans);
        for (int i=0;i<arr.length;i++){
            if (arr[i]<ans)
                ans=arr[i];
        }
        System.out.println("min"+ans);
    }
}
