package com.company.java.java;

public class remove_chInFirstString_presentInSecondString {
    public static void main(String[] args) {
        String str1 = "abhishek";
        String str2 = "abhi";
        String temp = "";
        char[] ch1 = str1.toCharArray();
        char[]ch2 = str2.toCharArray();
        char []ch3 =new char[ch1.length];

        for (int i = 0; i <ch1.length ; i++) {
            for (int j = 0; j <ch2.length ; j++) {

                if (ch1[i]==ch2[j]){
                    ch3[i] =ch1[i] ;
                    break;
                }
            }
        }
        System.out.println(ch3);
    }
}
