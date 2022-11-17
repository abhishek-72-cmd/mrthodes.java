package com.company.java.java;

public class String_concatination {
    public static void main(String[] args) {

        String str1 = "abhishek";
        String str2 = "vibhute";

        char [] ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();
        char [] ch3 = new char [ch1.length+ ch2.length] ;
        int j= 0;
        for (int i = 0;i<ch1.length;i++){
            ch3[j]=ch1[i];
        j++;
        }
        for (int i=0;i< ch2.length;i++){
             ch3 [j] = ch2[i];
             j++;
        }
        System.out.println(ch3);
    }
}
