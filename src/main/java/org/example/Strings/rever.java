package org.example.Strings;

public class rever {
    public static void main(String[] args) {
        StringBuilder ma = new StringBuilder();
        String s="sa ap";
        for(char c : s.toCharArray())
        {
            ma.append(c);
        }
        ma.reverse();
        System.out.println(ma);
    }
}
