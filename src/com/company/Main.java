package com. company;
import java.util.Scanner;
class program {
    public static void main(String args[]) {

     String str1 = "abhishek";
     String str2 = "abhiskab";
        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();
        System.out.println(str1.toCharArray());
        System.out.println(str2.toCharArray());

        int counter = 0;
        boolean isEqual = true;
            if (c1.length== c2.length){
        for (int i =0 ;i<c1.length;i++) {
                if (c1[i] == c2[i]) {
                    System.out.println(" equal charactors are " + c1[i]);
                 isEqual = true;
                    counter++;
            }

            System.out.println("the charactor " + " " + c1[i] + " is present " + " " + counter + " times");
        }
        } else {
                isEqual=false;
            }
            if (isEqual){
                System.out.println("Strings are equal");
            }else {
                System.out.println("Strings are not equal");
            }

        }
    }
