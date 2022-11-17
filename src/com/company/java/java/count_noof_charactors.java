package com.company.java.java;

public class count_noof_charactors {
    public static void main(String[] args) {


        String str = "a1b2h3i4";
        String temp = "";

        for (int i = 0; i <str.length() ; i++) {
            if (i%2==0){
                temp = temp + str.charAt(i);
            }
        }
        System.out.println(temp);
        System.out.println(temp.length());
    }
}
