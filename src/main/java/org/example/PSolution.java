package org.example;

public class PSolution {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 4};
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i <n; i++) {
            ans = ans + (arr[i] * arr[i]);
        }
        System.out.println(ans);
    }
}
