package org.example.dailyProblemSolution.str;

public class Removeleadingspaces {
    public static void main(String[] args) {
        String str="abc def\t";
        str=str.strip();
        System.out.println(str);
    }

    public static class RemoveSalas {
        public static String replaceSlash(String input){
            return input.replace("//"," ");
        }
        public static void main(String[] args) {
            String str="he//ll//o//world";
            System.out.println(replaceSlash(str));
        }

    }

    public static class DuplicateCharacters {
        public static void main(String[] args) {
            String str="Shivaa";
            int count=0;
            char ch[]=str.toCharArray();
            System.out.println("Duplicate characters:");
            for (int i=0;i<str.length();i++){
                for (int j=i+1;j<str.length();j++){
                    if (ch[i]==ch[j]){
                        System.out.println(ch[j]);
                        count++;
                        break;
                    }
                }
            }
        }
    }
}
