package com.company.java.java;
// string palendrom

public class MaximumAccouringCharactor {
    public static void main(String[] args) {
        String str = "abbbccc";

        int arr [] = new int [127];

        for (int i =0;i<str.length();i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }

        int max =0;
        char c = ' ';
        for (int i =0;i<str.length();i++){
            if (max<arr[str.charAt(i)]){
                c= str.charAt(i);
            }
        }
        System.out.println(c);


    }
}
