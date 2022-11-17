package com.company;


class Employee {
    int id;
    String name;
    int salary;
    int marks  ;

    public void PrintDetails(){
        System.out.println("my id is " + id);
        System.out.println(("my name is:"+name));
    }

    public int gateSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int marks (){
        return marks;
    }

}

class employee1 {
     int id ;
     String name ;
     public void PrintDetails(){
         System.out.println("my id is " + id);
         System.out.println("mynam eis " + name);
     }
}

    class Mobile {

     public void ring (){
         System.out.println("ringing ");
     }
     public void callFriend (){
         System.out.println("calling a friend");
     }
}

class Rectangle {

     public int sideA(int a){
         return a ;
     }
     public int sideB(int b ){
         return b;
     }
}


class Oops {

        public static void main(String[] args) {
            System.out.println("this is our custom class");

              Rectangle Area = new Rectangle();
              Area.sideA(5);
              Area.sideB(6);

              int totalArea =2* Area.sideA(5)* Area.sideB(6);
            System.out.println(" and the Total area is : " + totalArea );

            Employee harry = new Employee();
            Employee john = new Employee();
            Employee abhishek = new Employee();

            Mobile samsung = new Mobile();
            samsung.callFriend();




            harry.id = 12;
            harry.name = "code with harry";
            john.id = 13;
            john.name = "john khandawala";
            abhishek.id = 14;
            abhishek.name = "sir";
            harry.setName("goodguy");
            harry.salary=223;
            harry.marks=79;


            System.out.println(harry.id);
            System.out.println(harry.name);
            System.out.println(abhishek.name);
            System.out.println(abhishek.id);
            System.out.println(harry.gateSalary());
            System.out.println(harry.getName());
            System.out.println(harry.marks);

            harry.id = 45 ;
            harry.name = "codewithharry";

            System.out.println(harry.id);
            System.out.println(harry.name);

             employee1 sagar = new employee1();

             sagar.id = 403 ;
             sagar.name = "abhisheks brother";

            System.out.println( sagar.id);
            System.out.println(sagar.name);

        }
    }

