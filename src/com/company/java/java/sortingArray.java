package com.company.java.java;
public class sortingArray {
    public static int [] sort(int [] arr){
        int ZeroCount=0;
        int OneCount = 0 ;

        for (int i = 0; i<arr.length;i++) {

            if (arr[i] == 0)
                ZeroCount++;
            if (arr[i] == 1)
                OneCount++;
        }
        for (int i=0; i<ZeroCount;i++){
            arr[i]=0;
        }
        for (int i = ZeroCount;i<(ZeroCount+OneCount);i++){
            arr[i]=1;
        }
        for (int i = (ZeroCount+OneCount);i< arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {0,1,1,0,2,0,1,2};
        sort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
