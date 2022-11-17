package com.company.java.java;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        // finding out missing number
        int arr [] = {1,2,3,5,6};
        System.out.println(arr.length);
        int length = arr.length;
        int total_l = length+1;

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum+arr[i];
        }
        System.out.println("the sum is " + sum );
        int total_sum = total_l *(total_l+1)/2;
        System.out.println("the total sum is " + total_sum);
        System.out.println("the missing number is "  +( total_sum - sum));
    }
}
