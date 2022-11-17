package com.company.java;

public class question2 {

    public static void main(String[] args) {

        String s = "RUSHIKESH";
        int length = s.length();
        String temp = "";

        for (int i=0;i<length;i++){
            if (i%2==0){
                temp = temp+s.charAt(i);
            }else {
                int k=(i/2)+1;
                temp = temp+k;
            }
        }
        System.out.println(temp);
    }
}
