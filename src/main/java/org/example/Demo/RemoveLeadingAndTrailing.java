package org.example.Demo;

public class RemoveLeadingAndTrailing {
    public static void main(String[] args) {
        String s = "  abc  def\t";

        s = s.strip();
        s=s.trim();
        System.out.println(s);
        System.out.println(s);
    }
}
