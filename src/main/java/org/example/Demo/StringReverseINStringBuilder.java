package org.example.Demo;

public class StringReverseINStringBuilder {
    public static void main(String[] args) {
        String str="Shiva";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        if (str==null)
            throw new IllegalArgumentException("Null is not valid input");
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars=str.toCharArray();
        for (int i=chars.length-1;i>=0;i--)
            stringBuilder.append(chars[i]);
        return stringBuilder.toString();
    }
}
