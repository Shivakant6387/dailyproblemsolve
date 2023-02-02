package org.example;
public class AddTwoBinaryString {
    public static void main(String[] args) {
        String arr="1101",brr="100";
        System.out.println(addBinay(arr,brr));
    }
    private static String addBinay(String arr, String brr) {
    if (arr.charAt(0)=='0'&& brr.charAt(0)=='0'){
        return "0";
    }
    StringBuilder result=new StringBuilder(" ");
    int s=0;
    int i=arr.length()-1,j=brr.length()-1;
    while(i>=0 || j>=0|| s==1){
        s+=((i>=0)?arr.charAt(i)-'0':0);
        s+=((j>=0)?brr.charAt(j)-'0':0);
        result.append((char) (s%2+'0'));
        s/=2;
        i--;
        j--;
    }
    int start =result.length()-1;
    while (start>=0 && result.charAt(start)==0){
        start--;
    }
    if (start!=result.length()-1){
        result.delete(start+1,result.length());
    }
        return result.reverse().toString();
    }
}
