package introductionToOops;

public class CreatingObjects {

    static class Student {
        int rno;
        String name ;
        float marks;

        Student (int rno,String name,float marks ){
            this.rno=rno;
            this.name = name ;
            this.marks=marks;
        }

    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Abhishek",89.32f);
        System.out.println(student1.name + " " + student1.rno + " " + student1.marks);

    }
}
