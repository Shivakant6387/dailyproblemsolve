package org.example;

public class Writeyourownatoi
{
    static int myAtoi(String str){
        int res=0;
        // Iterate through all characters
        // of input string and update result
        // take ASCII character of corresponding digit and
        // subtract the code from '0' to get numerical
        // value and multiply res by 10 to shuffle
        // digits left to update running total
        for (int i=0;i<str.length();++i)
            res=res*10+str.charAt(i)-'0';
        return res;
    }

    public static void main(String[] args) {
        String str="89789";
        int val=myAtoi(str);
        System.out.println(val  );
    }
}
