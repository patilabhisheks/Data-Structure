package org.example.Strings;

import java.sql.SQLOutput;

public class reverseWords {
    public String reverseWord(String s) {
        String[] news = s.split(" ");
//        for(String c : news)
//        {
//            System.out.print(c.toCharArray());
//            System.out.print(" ");
//        }
        StringBuilder sb = new StringBuilder();

        for(String c: news){
            if(!c.isEmpty())
            {
                StringBuilder reverser = new StringBuilder(c);
                reverser.reverse();
                sb.append(reverser).append(" ");

            }
//            sb.append(c).toString();
            }
        sb.reverse();
        return sb.toString();
    }
     public static void main(String[] args) {
         String s ="a good   example";
        reverseWords reverseWords = new reverseWords();
        String reversed= reverseWords.reverseWord(s);
         System.out.println(reversed.toString().trim());
    }
}
