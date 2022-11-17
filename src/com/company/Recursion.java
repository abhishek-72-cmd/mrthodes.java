package com.company;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }

        double avg = (sum) / arr.length;

        System.out.println(avg);
    }
}