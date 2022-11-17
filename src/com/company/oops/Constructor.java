package com.company.oops;

 class phone  {

     public void showTime (){
         System.out.println( " time is 8");

     }

     public void on (){
         System.out.println("turing on ...");

     }

     public void callFriend(){
         System.out.println("calling a friend ");
     }

 }

 class Smartphone extends phone {

     public void music (){
         System.out.println(" playing music ");
     }

     public void on (){

     }
 }





public class Constructor {
    public static void main(String[] args) {
        phone oppo = new phone ();
        oppo.callFriend();

    }

}
