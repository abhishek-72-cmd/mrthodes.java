package com.company.java.java;

public class removeDuplicates {
    public static void main(String[] args) {
       int num =  132;
         int reminder = 0;
         int rev=0;
       while (num>0){
           reminder = num%10;
           rev = rev*10+ reminder;
           num = num/10;
       }

       if (rev==num){
           System.out.println("this is pelendrom");
       }else {
           System.out.println("not pelendrom");
       }
    }
    }
