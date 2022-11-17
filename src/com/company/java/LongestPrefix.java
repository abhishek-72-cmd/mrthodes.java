package com.company.java;
public class LongestPrefix {
    public static String findLongestPrefix(String [] strs){
        if (strs==null || strs.length == 0 ){
            return  " ";
        }
        String lcp = strs[0];
        for (int i =1 ; i< strs.length;i++){
            String currentWorld = strs[i];
            int j = 0 ;
            while (j < currentWorld.length() && j < lcp .length() && currentWorld.charAt(j)==lcp.charAt(j)){
                j++ ;
            }
            if (j==0)
                return "";
            lcp = currentWorld.substring(0,j);
        }
        return lcp;
    }
    public static void main(String args[]) {
        String [] strgs = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String result = findLongestPrefix(strgs);
        System.out.println(result);
    }
}