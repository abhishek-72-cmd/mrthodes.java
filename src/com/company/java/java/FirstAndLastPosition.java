package com.company.java.java;

// this will return the index value of target
public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target, boolean FindStartIndex) {
        int ans[] = {-1, -1};
        // check for the first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    // thi sfin return the index val of target
    static int search(int nums[], int target, boolean FindStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (FindStartIndex=true) {
                    end = mid - 1;
                } else if (FindStartIndex=false){
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

           int nums [] = {11,13,16,16,16,79,89,112,151,161};

           int ans = search(nums,16,true);
           int anss = search(nums,16,true);

        System.out.println(ans);
        System.out.println(anss);
    }
}
