package com.company.java.java;

public class SepratingTheInteger {
    public static void main(String[] args) {
        int num = 12564789;


        while (num>0){
            int reminder = num % 10;
            System.out.print(reminder);
            num = num/10;
        }


    }
}
