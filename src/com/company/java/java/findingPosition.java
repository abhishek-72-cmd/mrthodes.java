package com.company.java.java;
public class findingPosition {
    static int LeftOccurrence (int arr [],int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        int mid = start + (end- start)/2;
        while (start<=end){
            if (arr [mid] ==target){
                ans  = mid ;
                end = mid - 1;

            } else if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]){
                end = mid - 1 ;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
   static int RightOccurrence (int arr [] , int target){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        int mid = start + (end- start)/2;
        while (start<=end){
            if (arr [mid] ==target){
                ans  = mid ;
                start = mid + 1;

            } else if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]){
                end = mid - 1 ;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {2,4,4,4,4,4,4,6,8,10,13,16,18,22,32,15};
        int ans = LeftOccurrence(arr,4);
        System.out.println(" left most occurrence is " + " " + ans);
        int ans1 = RightOccurrence(arr,4);
        System.out.println(" Right most occurrence is " + " " + ans1);

    }
}

