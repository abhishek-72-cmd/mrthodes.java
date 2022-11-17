package com.company ;

public class finding_duplicates {
    public static void main(String[] args) {
        // sum of n natural number

        int arr [] = {11,12,13,14,15,11,13,16};
        boolean isFound = false;
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]==arr[j]  &&  i!=j ){
                    isFound=true;
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
        if (isFound==false ){
            System.out.println("no duplicate element ");
        }
    }

    }



