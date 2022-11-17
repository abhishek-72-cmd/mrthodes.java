package com.company;

public class Leadersinarray {
    public static void main(String[] args) {
    int arr [] = {15,16,3,2,6,1,4,};
    int size = arr.length;


    for(int i = 0; i<size; i++){

    int j;

        for ( j = i + 1; j < size; j++) {
            if (arr[i] <=arr[j])

                break;
        }

        if (j == size) // the loop didn't break
            System.out.print(arr[i] + " ");
    }
}
}