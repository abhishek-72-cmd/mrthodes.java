package com.company.java.java;

import java.util.Arrays;

public class find_NumberIs_powerOf2 {
    public static void main(String[] args) {

        // sort o and 1

        int[] arr = {0,1,0,1,0,1};
        int [] temp = new int [arr.length];
        int count = 0;
         int j = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==1){
                temp[j] = arr[i];
                j++;
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                arr[j]=arr[count]+arr[i];

            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
