package com.company.java.java;

public class copy_one_StringTO_AnotherString {

    public static void main(String[] args) {

        String str1 ="abjishek";
        String str2 = "";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = new char [ch1.length];

        int i = 0;
        while (i!=ch1.length){
            ch2[i]=ch1[i];
            i++;
        }
        System.out.println(ch1);
        System.out.println(ch2);
    }
}
