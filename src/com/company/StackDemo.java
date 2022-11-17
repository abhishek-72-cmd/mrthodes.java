package com.company;
class Stack {
    int arr[];
    int capacity;
    int top;
    Stack (int size ){
        this .arr = new int [size];
        this .top = -1;
        this. capacity =size ;
    }
    public void push (int x ) {
        if (top == arr.length - 1) {
            System.out.println("array is overfull");
        } else {
            System.out.println("inserting x " + x);
            arr[++top] = x;
        }
    }
            public static void main(String[] args) {
                Stack stack = new Stack(5);
                stack.push(20);
                System.out.println();
                stack.push(5);
                stack.push(10);
                stack.push(20);
                stack.push(30);
                stack.push(40);
                System.out.println();
            }
        }
