package com.company.java.java;

import java.util.Arrays;

public class remove_duplicates_from_String {
    public static void main(String[] args) {
        String str = "aabbhhiisshheekk";
        int n = str.length();
          char ch [] =  str.toCharArray();
        int count =0;
        for (int i = 0; i < str.length() ; i++) {
              int j;
            for ( j = 0; j < str.length() ; j++) {
               if (ch[i]==ch[j]){
                   break;
               }
            }
            if (j==i){
                ch[count++]=ch[i];
            }
        }
        System.out.println( String.valueOf(Arrays.copyOf(ch,count)));
    }
}
