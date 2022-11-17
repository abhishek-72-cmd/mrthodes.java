package com.company.java.java;

public class LongestPalandrom {

   static void LongestPal(String str){
       int start = 0;
       int end = 1;

       for (int i =1;i<str.length();i++){

           int low = i-1;
           int high = i;

           while ((low>0 && high<str.length())&& (str.charAt(high)==str.charAt(low))){
               if (high-low+1>end){
                   start=low;
                   end=high-low+1;
               }
               low--;
               high++;
           }
           low=i-1;
           high = i+1;

           while ((low>0&&high<str.length() && str.charAt(low)==str.charAt(high))){
               if (high-low+1>end){
                   start = low;
                   end = high-low+1;
               }
               low--;
               high++;
           }
       }
       System.out.println(str.substring(start,start+end));
   }


    public static void main(String[] args) {

    }
}
