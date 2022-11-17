package com.company.java.java;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {


        int [] arr1 = {11,12,13,14,15};
        int [] arr2 = {11,12,13,14,15};

      boolean b = Arrays.equals(arr1,arr2);
        System.out.println(b);
        int l1 = arr1.length;
        int l2 = arr2.length;

        boolean isEqual = true;

        if (l1==l2){
            for (int i = 0;i< arr1.length;i++){
                if (arr1[i]!=arr2[i]){
                    isEqual=false;
                }
            }
        }else {
            isEqual = false ;
        }
        if (isEqual){
            System.out.println("arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }
}
