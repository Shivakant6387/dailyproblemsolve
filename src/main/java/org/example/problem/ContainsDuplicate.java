package org.example.problem;

import java.util.HashSet;

public class ContainsDuplicate {
    static  boolean checkDuplicate(int arr[],int key){
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (set.contains(arr[i]))
                return true;
            set.add(arr[i]);
            if (i>=key)
            set.remove(arr[i-key]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={10,5,3,4,3,5,6};
        if (checkDuplicate(arr,3))
            System.out.println("Yse");
        else
            System.out.println("No");
    }
}
