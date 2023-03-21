package org.example.testdaily;

import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch(int arr[],int first,int last,int key){
        int mid=(first+last)/2;
        while (first<=last){
            if (arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]==key){
                System.out.println("Value is found at index :"+mid);
                break;
            }else {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if (first>last){
            System.out.println("Value is not found");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter element of the size you want ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" value");
        for (int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();
            System.out.println("Enter value you want to search");
            int key=scanner.nextInt();
            int last=arr.length-1;
            binarySearch(arr,0,last,key);
    }
}
