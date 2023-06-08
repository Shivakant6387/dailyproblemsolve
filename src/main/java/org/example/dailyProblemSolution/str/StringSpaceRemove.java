package org.example.dailyProblemSolution.str;

public class StringSpaceRemove {
    public static String removeSpace(String str){
        StringBuilder builder=new StringBuilder();
        char[]chars=str.toCharArray();
        for (char ch:chars){
            if (!Character.isWhitespace(ch))
                builder.append(ch);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String str="Shiva  Kant Singh";
        System.out.println(removeSpace(str));
    }
}
