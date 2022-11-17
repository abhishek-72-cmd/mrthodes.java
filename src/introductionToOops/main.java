package introductionToOops;
import java.util.Arrays;
public class main {
    // datatype for every single student
    static class Student { // creating a class
        int rno;
        String name;
        float marks;

        void greeting (){
            System.out.println("my name is  " +this.name );
        }

        Student (){    // constructor  // empty constructor for new object
            this.rno = 2;
            this.name = "vibhute";
            this.marks = 80;

        }
            void changeName ( String newName ){
            name = newName;
                System.out.println(newName);
            }

        Student (int rno,String name,float marks){    // constructor
            this.rno = rno;
            this.name = name;
            this.marks = marks;

        }

        Student  (Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;

        }
    }

    public static void main(String[] args) {
       /* Student[] students = new Student[5];
        int rno[] = new int[5];
        String name[] = new String[5];
        float marks[] = new float[5];
*/
        Student student1 = new Student();  // creating an object
     //  System.out.println(student1.rno);

        Student abhi = new Student();
        System.out.println(abhi.rno);
        System.out.println(abhi.marks);
        System.out.println(abhi.name);

        abhi.greeting();
         abhi.changeName("abhishek vibhute");

         Student random = new Student(abhi);
        System.out.println(random.name);

        Student shubham = new Student(17,"shubham",67);
        // this will be replaced with shubham

        }
    }
