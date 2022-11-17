package com.company;
import java.util.Scanner;
public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc .nextInt();

        boolean isPrime = true ;
        for (int i = 2 ; i<=n/2;i++){
           if (n%i==0){
               isPrime=false;
              break;
           }
            }
        if (isPrime){
            if (n==1){
                System.out.println("neither prime nor composite");
            }
            System.out.println("this is prime number ");
        } else {
            System.out.println("this is not prime number ");
           }
        }
    }
