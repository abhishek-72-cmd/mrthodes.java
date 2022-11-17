package com.company.java.java;

public class find_FirstAndLast_indexOFString {
    public static void main(String[] args) {

        String str1 = "ABHISHEKVIBHUTE";
        char[] ch = str1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'B') {
                System.out.println(" first accourance of the B is at position" + i);
                break;

            }
        }
        for (int i = ch.length-1; i >= 0; i--) {
            if (ch[i] == 'B') {
                System.out.println(" last accourance of the B is at position" + i);
                break;
            }
        }
    }
}
