package com.company;
import java.util.Random;
import java.util.Scanner;
public class exercise {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if (userInput == computerInput) {
            System.out.println("draw");

        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 || computerInput == 1) {
            System.out.println("you win");
        } else {
            System.out.println("computer win");
        }   System.out.println("wants to continue");


        System.out.println("computer choice" + " " + computerInput);
        if (computerInput == 0) {
            System.out.println("computer input is rock");
        } else if (computerInput == 1) {
            System.out.println("computer choice is paper");
        } else if (computerInput == 2) {
            System.out.println("computer choice is scissor");

        }



                }
    }
