package com.company.oops;

import java.util.Arrays;

public class MaxVal {

    static void swap(int arr[], int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                System.out.println("second largest element is " + arr[i]);

            }
        }
        return max;
    }

    static void reverse (int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }




    public static void main(String[] args) {
      int arr [] = {15,4,87,65,96};


      int ans = max(arr);
        System.out.println(ans);
       /* System.out.println(ans);
        swap(arr,1,3);

        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
*/

    }
}

