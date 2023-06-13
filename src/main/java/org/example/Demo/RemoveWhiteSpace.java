package org.example.Demo;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="This is an elephant";
        str.trim();
        System.out.println(str);
        str=str.replace(" ","");
        System.out.println(str);

        char[]arr=str.toCharArray();
        String tempStr="";
        for(char c:arr){
            if (c !=' '){
                tempStr+=c;
            }
        }
        str=tempStr;
        System.out.println(str);
    }
}
