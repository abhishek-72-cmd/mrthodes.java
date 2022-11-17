package com.company.oops;
import java.util.*;
public class swap {
    public static void main(String[] args) {

        int arr[] = {26,36,32,25,69,45,65};
        int l = arr.length;
        for( int i = 0;i<arr.length;i++){
            for (int j = 1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;



                }

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(new int[]{arr[l - 2]}));


    }
}

