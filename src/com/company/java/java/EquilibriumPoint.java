package com.company.java.java;

public class EquilibriumPoint {

    public static void main(String[] args) {

        int arr []= {2,9,3,4,0,3,3,2,9,1,};
        int n = arr.length;


        for (int i=0; i<n;i++){
            int leftSum=0;
            int rightSum=0;
            for (int k=0 ; k<i;k++)
                leftSum+=arr[k];
            for (int k=i+1;k<n;k++)
                rightSum+=arr[k];
             if (leftSum==rightSum){

                 System.out.println(i);
                 break;
             }
        }
    }
}
