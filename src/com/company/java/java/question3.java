package com.company.java.java;

public class question3 {

        public static void main(String[] args) {

            String s = "RUSHIKESH";
            int length = s.length();
            String temp = "";
            for (int i=0;i<length;i++){
                if (i%3 == 0 || i%3==1){
                    temp = temp+s.charAt(i);
                }else {
                    int k=0;
                    k =(i/3)+1;
                    temp = temp+k;
                }
            }
            System.out.println(temp);
        }
}


