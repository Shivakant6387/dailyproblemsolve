package org.example.Demo;
import java.util.Arrays;
public class Moveallnegativenumber {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
    public static void move(int[] arr) {
        Arrays.sort(arr);
    }
}
