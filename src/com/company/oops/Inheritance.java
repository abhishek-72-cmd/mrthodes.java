package com.company.oops;

       class Account {
    public String name ;
    String email;
    private String Password;
           // getters and setters
    public String getPassword(){
        return this.Password;
    }
        public String setPassword(String pass) {
         return this.Password = pass;
    }
       }
              class college {
               int rno;
               float marks ;
               String name;

           college(){
               this.rno=rno;
               this.marks=marks;
               this.name = name ;
           }
           public void printInfo(String name ,float marks){
               System.out.println(marks);
               System.out.println(name);
           }
}
    public class Inheritance {
        public static void main(String[] args) {
       Account Account1 = new Account ();
       Account1.name="Apna college";
       Account1.email="Apnaclh@gmail.com";

       Account1.setPassword("Abhi");
            System.out.println(Account1.getPassword());

        Student student1 = new Student();
            student1 .name ="abhi";
            student1.marks=80;
            student1.rno=1;

            System.out.println(student1.name);

          }
    }
