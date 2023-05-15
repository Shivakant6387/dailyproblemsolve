package org.example.dailyProblemSolution;

public class StringReverseUseStringBuilder {
    public static void main(String[] args) {
        String str="Automation";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
