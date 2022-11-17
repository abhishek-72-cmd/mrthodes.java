package com.company;
class  stackSS {

    int arr[];
    int capacity;
    int top;

    stackSS(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;

    }

    boolean empty() {
        return top == -1;
    }

    boolean full() {
        return top == capacity - 1;

    }

    public void push(int x) {
        if (empty()) {
            System.out.println(" stack is empty ");

        } else {
            System.out.println(" inserting x " + " " + x);
            arr[++top] = x;

        }
    }
        public boolean isEmpty () {
            return top == 0;
        }

        public int Pop ( int ele){

            int removeEle = -1;
            if (top == -1) {
                System.out.println("stack is full");

                return -1;
            } else {
                removeEle = arr[top];
                System.out.println("removed element " + removeEle);
                top--;
            }
            return removeEle;
        }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


    }
}