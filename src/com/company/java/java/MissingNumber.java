package com.company.java.java;

public class MissingNumber {
    public static void main(String[] args) {

        int arr [] = {1,2,3,5,6};
        System.out.println(arr.length);
        int n = arr.length + 1;
        int sum = n * (n+1) / 2 ;
        for (int i = 0; i<arr.length;i++) {
            sum = sum - arr [i];

        }
        System.out.println(" the missing number is  "+ sum);

    }
}
