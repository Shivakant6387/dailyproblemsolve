package org.example.testdaily;

public class ReverseAStringBuild {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
      String str="Shiva Anjum";
        System.out.println(reverseString(str));
    }
}
