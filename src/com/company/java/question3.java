package com.company.java;

public class question3 {
    public static void main(String[] args) {
        int arr[] = {11, 14, 16, 18, 20};
        int a = 14;
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                isFound = true;
                System.out.println("element is found at index " + i);
                break;
            }
        }

        if (isFound == false) {
            System.out.println("element not found");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > a) {
                    System.out.println("another greater element is " + arr[j]);
                    break;
                }

            }
        }
    }
}