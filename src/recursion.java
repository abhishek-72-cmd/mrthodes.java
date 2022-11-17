import com.company.Cylinder;

import java.util.Arrays;
import java.util.Scanner;

public class recursion {

    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

    public static int fib(int n) {

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
        return a;
    }
// (1) print sum of n natural number

    public static void PrintSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;


        }


    }
// (2) print the Factorial

    public static int PrintTheFac(int n) {

        if (n < 0) {
            System.out.println(" invalid Index ");


        }

        int factorial = 1;

        for (int i = n; i <= 1; i--) {
            factorial = factorial * i;

            System.out.println(factorial);

            return factorial;
        }
        return -1;
    }

// print the half of pyramid




    static void PrintThePattern() {

        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {


                System.out.print("*");
            }

            System.out.println();
        }

    }

    // make a  calculator


    static void cal() {

        int operator = 2;
        int a = 10;
        int b = 20;

        switch (operator) {

            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (a == 0) {
                    System.out.println("invalid index");
                } else {
                    System.out.println(a / b);
                    break;
                }
            case 5:
                if (a == 0) {
                    System.out.println("invalid index");
                } else {
                    System.out.println(a % b);
                    break;
                }

        }
    }

    static int Marks(int n) {

        Scanner sc = new Scanner(System.in);

        int input;
        do {

            int Marks = sc.nextInt();

            if (Marks >= 90 && Marks <= 100) {
                System.out.println("this is good ");
            } else if (Marks >= 60 && Marks <= 89) {
                System.out.println("this is also good ");
            } else if (Marks >= 35 && Marks <= 59) {
                System.out.println("this is also good ");
            } else if (Marks >= 0 && Marks <= 34) {
                System.out.println(" really bad  ");
            } else {
                System.out.println("invalid ");

            }
            System.out.println("wants to continue ");

            input = sc.nextInt();

        } while (input == 1);
        return n;
    }
    // print the number is prime or not

    static void Prime(int n) {

        if (n <= 1) {
            System.out.println(" invalid ;number ");
            return;
        }
        boolean prime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            if (n == 1) {
                System.out.println("neither prime not compos");

            } else {
                System.out.println("this is prime nu,ber ");
            }
        } else {
            System.out.println(" this is not prime number ");
        }
    }

    // write a function to multiply 2 numbers

    static int Product(int a, int b) {

        int product = a * b;
        return product;
    }

    // print the factorial

    static int PrintFac(int a) {

        if (a <= 0) {
            System.out.println("invalid index");

        } else {

            int Fac = 1;

            for (int i = a; i >= 1; i--) {
                Fac = Fac * i;


            }
            System.out.println(Fac);
        }
        return PrintFac(13);

    }

    class AreaOfCylinder {

        int height;
        int radius;

        public AreaOfCylinder(int height, int radius) {
            this.height = height;
            this.radius = radius;

        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;

        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public double SurfaceArea() {
            return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * radius * height;

        }

        public double Volume() {

            return Math.PI * radius * radius * height;
        }
    }

    static void swap (int a , int b){

        int temp = 0;
        temp = a;
        a = b;
        b=temp;
        System.out.println(temp);
    }
    static int avg (int x){
        int sum = 0;
        for (int i = 0 ; i<=x;i++){
            sum = sum+i;

            int avg = sum / (x);
        }
        return avg(5);
    }
        static void largeNum(int x){

            int  [] arr =  {10,13,15,17,19,23,29,32,2};
            int temp;
            for (int i = 0 ; i<arr.length;i++){
                for (int j = 1 ; j <arr.length-1 ; j++){

                    if (arr[j] < arr[j-1]){
                        temp = arr[j];
                        arr[j]=arr[j-1];
                        arr [j-1]=temp;
                        System.out.print(Arrays.toString(arr));
                    }
                }
            }
            boolean found = false ;
            for (int i = 0 ; i<arr.length;i++){
                if (arr[i]==x){
                    System.out.println(" element found at index " + arr[i]);
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println("element did not  exist");
                int greaterElement = x;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > x) {
                        greaterElement = arr[i];
                        System.out.println(" next greater element is  " + arr[i]);
                        break;
                    }
                }
            }
            if (found == false ){
                System.out.println("the smaller element than given number in an array is ");
                int smallerElement = x;
               for (int i = 0 ; i<arr.length;i++){
                   if (arr[i] < x){
                       smallerElement = arr[i];
                       System.out.println(arr[i]);
                       break;
                   }
               }
            }
        }

        static void duplicates (int [] arr){
         boolean duplicates = false ;
         for (int i = 0 ; i<arr.length;i++){
             for (int j = 1 ; j<arr.length-1;j++){

                 if (arr[i]==arr[j]  && i!=j){
                     duplicates=true;
                     System.out.println(arr[i]);
                 }

             }
         }

         if (duplicates==false ){
             System.out.println("no duplicate ");
         }

        }

        static void removeDuplicates (int [] arr ){

         int [] temp = new int [arr.length];
         int j = 0;

         for (int i = 0 ; i<arr.length;i++){
             if (arr[i] != arr[i+1]) {
                 temp[j] = arr[i];
                 j++;
             }
         }
            for (int i = 0 ; i<temp.length;i++) {
                System.out.println(temp[i]);
            }

        }


        public static void main(String[] args) {
         /*   fib(10);
            System.out.println(sum(10));
            System.out.println(PrintTheFac(10));
            PrintThePattern();
            cal();
            //System.out.println(" even no till 25 are ");
            //System.out.println(PrintTheFac(25));
            Marks(80);
            //    System.out.println("prime");
            //    Prime(13);
            Product(12, 13);
            System.out.println(Product(12, 13));
            System.out.println(PrintFac(13));
            Cylinder mycylinder = new Cylinder();
          swap(10,20);
            System.out.println(avg(5));
*/
            largeNum(14);

            int [] arr  = {10,11,12,13,11,12,16,20};

    //duplicates(arr);
    removeDuplicates(arr);
    }

    }
