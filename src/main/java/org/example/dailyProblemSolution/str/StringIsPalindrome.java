package org.example.dailyProblemSolution.str;

public class StringIsPalindrome {
    public static boolean checkPalindrome(String str){
        boolean result=true;
        int length=str.length();
        for (int i=0;i<length/2;i++){
            if (str.charAt(i)!=str.charAt(length-i-1)){
                result= false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str="radar";
        System.out.println(checkPalindrome(str));
    }
}
