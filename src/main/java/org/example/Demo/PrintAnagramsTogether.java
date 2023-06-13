package org.example.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        String arr[]={"cat","dog","tac","god","act"};
        printAnagram(arr);
    }
    private static void printAnagram(String arr[]){
        HashMap<String , List<String>>map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            String word=arr[i];
            char[]letters=word.toCharArray();
            Arrays.sort(letters);
            String newword=new String(letters);
            if (map.containsKey(newword)) {

                map.get(newword).add(word);
            }
            else {
                List<String>words=new ArrayList<>();
                words.add(word);
                map.put(newword,words);
            }
        }
        for (String s:map.keySet()){
            List<String>values=map.get(s);
            if (values.size()>1){
                System.out.print(values);
            }
        }
    }
}
