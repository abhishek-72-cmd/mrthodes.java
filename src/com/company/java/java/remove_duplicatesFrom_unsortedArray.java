package com.company.java.java;

import java.util.Arrays;

public class remove_duplicatesFrom_unsortedArray {
    public static void main(String[] args) {
        int arr[] = {9, 6, 10, 11, 9, 6, 12, 13, 2, 3, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        // remove duplicates
        int[] temp = new int[arr.length];
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[i-1] && i!=k){
                temp[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(Arrays.toString(temp));
                 break;
        }
    }
}
