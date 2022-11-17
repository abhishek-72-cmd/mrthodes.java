package com.company.java;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {

      String s1 = "RUSHIKESH";
      int length = s1.length();
      String temp = "";

      for (int i=0;i<length;i++){
          if (i%3==0 || i%3==1){
              temp = temp+ s1.charAt(i);
          } else {
              int k = 0;
              k = (i/3)+1;
              temp = temp+k;
          }
      }
        System.out.println(temp);
    }
}



