package com.company.java.java;

public class ReverseAnArrayInGroupOfGivenSize {

    public static void reverse(int arr[], int k) {
        int length = arr.length;

        for (int i = 0; i < length; i = i + k) {
            int start = i;
            int end = Math.min(i + k - 1, length - 1);
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 2, 3, 6, 7, 8, 9,};
        int k = 3;

        reverse(arr, k);
        for (int val : arr) {
            System.out.println(val + " ");
        }
    }
}

