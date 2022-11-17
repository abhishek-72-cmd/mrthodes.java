package com.company.java.java;

public class Remove_Spaces_FromString {
    public static void main(String[] args) {
        String str1 = "a b h i a s h e k";
        String str2 = "";
        str2 = str1.replaceAll("\\s" ,"");
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str2.length());

    }
}
