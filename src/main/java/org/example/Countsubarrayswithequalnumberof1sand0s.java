package org.example;

import java.util.HashMap;
import java.util.Map;

public class Countsubarrayswithequalnumberof1sand0s {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        Map<Integer,Integer>map=new HashMap<>();
        int curr_sum=0;
        for(int i=0;i<n;i++){
            curr_sum+=(arr[i]==0)? -1:arr[i];
            map.put(curr_sum,map.get(curr_sum)==null ? 1 :map.get(curr_sum)+1);
        }
        int count =0;
        for(Map.Entry<Integer,Integer>itr:map.entrySet()){
            if (itr.getValue()>1)
                count+=((itr.getValue()*(itr.getValue()-1))/2);
        }
        if (map.containsKey(0))
            count+=map.get(0);
        return count;
    }
    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println("Count = " + countSubarrWithEqualZeroAndOne(arr, n));
    }
}
