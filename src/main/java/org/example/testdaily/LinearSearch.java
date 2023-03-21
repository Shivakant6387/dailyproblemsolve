package org.example.testdaily;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of  the value you want");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter"+size+"values :");
        for (int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();
        System.out.println("Enter value you want to search");
            int target=scanner.nextInt();
            int position=-1;
            for (int i=0;i<arr.length;i++) {
                if (arr[i] == target) {
                    position = i;
                    break;
                }
            }
            if (position!=target){
                System.out.println(target+"found atr position"+(position+1));
            }
            else {
                System.out.println(target+"not found");
            }
    }
}
