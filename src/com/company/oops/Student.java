package com.company.oops;

public class Student {
    int rno;
    String name;
    float marks;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int rno){
        System.out.println(rno);
    }

    public void printInfo(String name,float marks){
        System.out.println(name);
        System.out.println(marks);
    }


}
    class Oops {
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.marks=80;
            student1.name = "abhishek";
            student1.rno=1;

            student1.printInfo("abhishek");

            Student student2 = new Student();
        }


    }

