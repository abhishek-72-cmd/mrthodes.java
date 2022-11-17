package com.company.oops;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int rows= sc.nextInt();
        int cols= sc.nextInt();
        int [][] numbers = new int [rows][cols];
        //for input
        for (int i = 0 ; i< rows;i++){
            for (int j = 0;j< cols;j++){
                numbers  [i] [j]= sc.nextInt();
            }
        }
              // for output;
        System.out.println("value of x is ");
        int x = sc.nextInt();
        for (int i = 0 ; i< rows;i++){
            for (int j = 0;j< cols;j++){

                if (numbers[i][j]==x){
                    System.out.println( "x is found at index"  + i + " " + j);
                }
                System.out.println(numbers[i][j]+ " ");

            }
        }

    }



}
