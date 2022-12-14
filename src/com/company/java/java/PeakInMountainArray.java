package com.company.java.java;
public class PeakInMountainArray {
    static int peakInMount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end +1;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,3,2,1};
        int ans = peakInMount(arr);
        System.out.println(ans);
    }
}
