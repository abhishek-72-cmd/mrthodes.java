package com.company.java.java;
import java.util.Arrays;
public class bubbleSort {
    static void sort(int arr[]){
        for (int i = 0;i<arr.length;i++){
            for (int j = i+
                    1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {15,14,13,11,6,9,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
