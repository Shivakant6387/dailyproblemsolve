package org.example.Demo;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(checkPalindromeString("shiva"));
        System.out.println(isPalindrome("Shiva"));

    }
    public static boolean checkPalindromeString(String input){
        boolean result=true;
        int length=input.length();
        for (int i=0;i<length/2;i++){
            if (input.charAt(i)!=input.charAt(length-i-1)){
                result=false;
                break;
            }
        }
        return result;
    }
    public static boolean isPalindrome(String input){
        int i=0,j=input.length()-1;
        while (i<j){
            if (input.charAt(i)!=input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
