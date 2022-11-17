package com.company.java;
import java.util.Scanner;
public class MaxEle {
    public static void main(String[] args) {
        int arr [] = {11,12,13,14,15};

        int max = arr[0];
        for (int i = 1 ;i<arr.length;i++){
            if (max < arr [i]){
                max=arr [i];
            }
        }
        System.out.println("max element is " + max);

      }
}
