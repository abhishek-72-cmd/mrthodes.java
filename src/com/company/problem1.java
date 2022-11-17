package com.company;

import java.util.Scanner;

public class problem1 {

    public static void main (String [] args) {
   /* Write a program to find the smallest integer value ‘b’ for the given value of
‘a’.
    If we multiply the digits of ‘b’, we should get the exact value of ‘a’.
    Result ‘b’ must contain more than one digit.
*/
        int j = 0;
        int arr[] = new int[1000];
        System.out.println(" enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        if (n<10){
            System.out.println(n+10);
        }

        for (int i = 9 ; i>1;i--){
            while (n%i==0){

                 n = n/i;
                 arr[j++]=i;
            }
        }
        if (n>10) {
            System.out.println("Not Possible");
        }
             else {
                for(int i=j-1;i>=0;i--){
                    System.out.println(arr[i]);
                }
            }
        }
    }


