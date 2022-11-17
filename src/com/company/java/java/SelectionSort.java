package com.company.java.java;
import java.util.Arrays;
public class SelectionSort {
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }
        static void swap(int arr[],int first,int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int j = start; j <= last; j++) {
            if (arr[max] <  arr[j]) {
                max = j;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
