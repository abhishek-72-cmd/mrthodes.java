package com.company.oops;

import java.util.Arrays;

public class InterviewPractice {

    static void reverseString(String str) {

        char[] ch = str.toCharArray();
        int length = ch.length;

        for (int i = length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    static void findSimillerElements(String str) {

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[i]);

                }
            }
        }
    }

    static void replacingElementWithString(String str) {
        // char [] ch = str.toCharArray();
        int length = str.length();
        String temp = " ";

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                temp = temp + str.charAt(i);
            } else {
                int k = (i / 2) + 1;
                temp = temp + k;
            }
        }
        System.out.println(temp);
    }

    static void replacingElementWithString1(String str) {
        int length = str.length();
        String temp = " ";
        for (int i = 0; i < length; i++) {
            if (i % 3 == 0 || i % 3 == 1) {
                temp = temp + str.charAt(i);
            } else {
                int k = 0;
                k = (i / 3) + 1;
                temp = temp + k;
            }
        }
        System.out.println(temp);

    }

    static void checkingEquality  (String str,String str1){
        if (str.equals(str1)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("strings are not equal");
        }
    }
       static void removeChar (String st){
         String str = "ABCDEFG";
         char[] ch = str.toCharArray();

           System.out.println(str.replace("B",""));

       }

        static void ChangeCase (char ch){
        if (ch>='A' && ch<='Z'){
          char ch2 = Character.toLowerCase(ch);
            System.out.println(ch2);
        } else {
            char ch2 = Character.toUpperCase(ch);
            System.out.println(ch2);
        }
        }

        static void findElement(int [] arr,int x) {

            boolean isFound = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    System.out.println(" x is found at " + " " + i);
                    isFound = true;
                    break;

                }
            }
            if (isFound == false) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > x) {
                        System.out.println(arr[j]);
                        break;

                    }

                }
            }
        }

        static int  findElement1 (int [] arr,int x){

        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (x==arr[mid]){
                return mid ;
            }
            if (x>arr[mid]){
                start = mid+1;
            }else if (x<arr[mid]){
                end = mid-1;
            } else {
                return mid;

            }
        }
        return -1;
        }

        static void arraysAreEqualOrNot (int [] array , int [] array1) {

            int length1 = array.length;
            int length2 = array1.length;

               if (length1==length2){
                         boolean isEqual = false ;
                   for (int i= 0 ;i<length1;i++){
                   if (array[i]==array1[i]){
                       isEqual=true;
                   }else {
                       isEqual=false;
                   }
                   }

                   if(isEqual==true){
                       System.out.println("Arrays are equal");
                   }else {
                       System.out.println("Arrays are not equal");
                   }

               } else {
                   System.out.println("Arrays are not equal");
               }
}


         static void  findDuplicates (int []arr){
             boolean duplicate=false;
        for (int i = 0 ;i<arr.length-1;i++) {
            for (int j = i + 1; j  < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicate = true;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
             if (duplicate==false ){
                 System.out.println("no duplicate element ");
             }
         }

         static void removeDuplicate (int [] arr ){
        int  [] temp = new int [arr.length];
                   int j = 0;
             for (int i = 0 ; i<arr.length-1;i++){
                if (arr[i]!=arr[i+1]){
                    temp[j]=arr[i];
                    j++;
            }


            }
             temp[j]= arr.length-1;
             for (int i = 0 ; i<arr.length;i++) {
                 System.out.println(temp[i]);
             }
             }

                  static void printPattern(){

                         for (int i = 0;i<=4;i++) {
                             int no=i;
                             for (int j = 0; j <= i; j++) {
                                 System.out.println("*");
                                 no = i*2;
                             }
                             System.out.println(" ");

                         }
                  }

                  // finding second largest element
    static void bubbleSort (int []arr){

        int l = arr.length;
        for( int i = 0;i<arr.length;i++){
            for (int j = 1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;

                }
            }

        }

    }

        static void findUpperCseOrLowercase(char ch){

               if (ch>='A'&&ch<='Z'){
                   System.out.println("uppercase latter");
               } else {
                   System.out.println("Lowercase letter");
               }
        }



 static void  firstRepeatingElements(int  [] arrz){

        int l = arrz.length ;
        boolean element = false;
         for (int i=0;i<l;i++){
             for (int j = 1;j<l;j++){
                 if (arrz[i]==arrz[j]&& i!=j){
                     element = true ;
                     System.out.println(arrz[j]);
                 } else {
                     element = false ;
                 }

             }

             }
     }



    public static void main(String[] args) {
        reverseString("abhishek");
       findSimillerElements("abcdab");
       replacingElementWithString("RUSHIKESH");
       replacingElementWithString1("RUHSHIKESH");
       checkingEquality("abhishek","ABHISHEK");
       removeChar(" ABCDEFG");
       ChangeCase('a');
       int [] arr = {44,16,23,29,56,13};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(new int []{arr [arr.length-2]}));
        findElement(arr,15);
       int ans =  findElement1(arr,22);
        System.out.println(ans);
        int []array = {11,12,13,14,15,18,20};
        int [] array1 = {11,12,13,14,15,18,19};
        arraysAreEqualOrNot(array,array1);
        findUpperCseOrLowercase('V');

        int [] arrz = {11,12,13,11,12,14,15,18,13,19};
            firstRepeatingElements(arrz);

    }
}
