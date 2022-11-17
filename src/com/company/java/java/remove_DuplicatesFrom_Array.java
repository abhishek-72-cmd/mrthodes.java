package com.company.java.java;

import java.util.Arrays;

public class remove_DuplicatesFrom_Array {
    public static void main(String[] args) {

        int  arr [] = {10,11,12,13,13,14,14,15};

      Arrays.sort(arr);
        int []temp = new int [arr.length];
        int j = 0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]!=arr[i-1] && i!=j){
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
