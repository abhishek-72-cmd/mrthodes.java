package com.company.java.java;

public class ReverseString {
    public static void main(String[] args) {

        String name = "abhishek";
        int length = name .length();


        for (int i = length-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
