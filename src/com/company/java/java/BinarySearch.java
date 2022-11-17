package com.company.java.java;
public class BinarySearch {
    public static  char nextGreaterLetter(char[]letters,char target){
        int start = 0;
        int end = letters.length-1;

        while (start<=end){
            // find the middle element
            int mid = start + (end - start )/2;

            if (target < letters[mid] ){
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }

    public static void main(String[] args) {

        char [] letters = {'c','f','j','l','n' };
     char ans = nextGreaterLetter(letters,'j');

        System.out.println(ans);
    }
}
