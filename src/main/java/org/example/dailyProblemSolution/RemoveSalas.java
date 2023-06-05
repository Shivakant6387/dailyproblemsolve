package org.example.dailyProblemSolution;
public class RemoveSalas {
    public static String replaceSlash(String input){
        return input.replace("//"," ");
    }
    public static void main(String[] args) {
        String str="he//ll//o//world";
        System.out.println(replaceSlash(str));
    }

}
