package com.company.oops;
class Animal {      //class
    Animal (){  // constructor
        System.out.println("creating a new Animal");
    }
    public void walk (){   // function
        }
    public void eat (){
        System.out.println("animal eats");
    }

    public void hunt (){
        System.out.println("animal does not hunt ");
    }
}

class horse extends Animal {  // inheritance
    horse (){  // Constructor
        System.out.println("Created a horse ");
    }
    public void walk (){
        System.out.println("walk on four legs");
    }
}

class chicken extends Animal {
    public void walk (){
        System.out.println("walk on two  legs");
    }
}
class dog extends Animal {
public void eat (){
    System.out.println("eat chapati");
}
}

public class Abstraction {
    public static void main(String[] args) {

      horse horse1 = new horse();  // object created
      Animal animal1 = new Animal();
      /*horse1.walk();
      horse1 .eat();
      chicken chicken1 = new chicken();
      chicken1.walk();
      dog dog1 = new dog ();
      dog1.eat();

    }
       */
}
    }
