package org.example.testdaily;

public class ReverseAStringInBuilt {
    public static void main(String[] args) {
        String str="Anjum Shiva";
        String revStr=" ";
        for (int i=str.length()-1;i>=0;--i){
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);
    }
}
