package org.example.Demo;
import java.util.*;
public class OnlyOddNumberAdd {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(97);
        System.out.println(onlyOddNumberAdd(list));
        System.out.println(onlyOddNumbersAdd(list));
    }
    public static boolean onlyOddNumberAdd(List<Integer>list){
        for (int i:list){
            if (i%2==0)
                return false;
        }
        return true;
    }
    public static boolean onlyOddNumbersAdd(List<Integer>list){
        return list.parallelStream().anyMatch(x->x%2!=0);
    }
}
