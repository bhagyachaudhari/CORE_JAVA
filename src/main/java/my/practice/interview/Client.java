package my.practice.interview;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word = sc.nextLine().toCharArray();
        String sub = sc.nextLine();

        int n = word.length;
        int m = sub.length();
        boolean placed = false;

        // Scan from rightmost start position
        //for (int i = n - m; i >= 0; i--) {
        for (int i = 0; i <= n-m; i++) {
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                if (word[i + j] != '?' && word[i + j] != sub.charAt(j)) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                for (int j = 0; j < m; j++) {
                    word[i + j] = sub.charAt(j);
                }
                placed = true;
                break;
            }
        }

        if (!placed) {
            System.out.print("-1");
            return;
        }

        // Replace remaining '?' with 'a'
        for (int i = 0; i < n; i++) {
            if (word[i] == '?') word[i] = 'a';
        }

        System.out.print(new String(word));
    }


    public String create(String word, String substr) {


        int m = word.length();
        int n = substr.length();
        boolean placed = false;
        char[] wordArr = word.toCharArray();

        // as?b?e?gf
        // dbk

        for(int i = 0; i < n - m; i++) {
            boolean found = true;
            for(int j = 0; j < m; j++) {
               if(wordArr[i+j] != '?' && wordArr[i+j] != substr.charAt(j)) {
                   found = false;
                   break;
               }
            }

            if(found) {
                for(int j = 0; j < m; j++) {
                    wordArr[i+j] = substr.charAt(j);
                }
                placed = true;
                break;
            }

        }

        if (!placed) {
            System.out.print("-1");
            return "";
        }

        // Replace remaining '?' with 'a'
        for (int i = 0; i < n; i++) {
            if (wordArr[i] == '?') wordArr[i] = 'a';
        }

        return "";
    }
}
