package com.company.java.java;

import java.util.Arrays;

// Find the given element in Array
// if element not found then
// find the next greater element and next smaller element in Array

public class Finding_G_and_S_element {
    public static int[] sort(int [] arr){

        Arrays.sort(arr);
        return arr ;
    }
    static void findGAndSNumber(int [] arr , int x) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                found = true;
                System.out.println("element is found at index " + i);
                break;

            }
        }
        if (found == false) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > x) {
                    System.out.println(" the greater number is " + " " + arr[i]);
                    break;
                }
            }
        }

        if (found == false) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < x) {
                    System.out.println(" the smaller number is  " + arr[i]);
                    break;
                }
            }

        }

    }
    public static void main(String[] args) {
        int  [] arr = {13,15,16,11,14,32,3};
        sort(arr);
        findGAndSNumber(arr,10);
    }
}
