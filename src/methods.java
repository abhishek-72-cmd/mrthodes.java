public class methods {

    static void tellJoke() {

        System.out.println(" i am cleaver");

    }

    static int telljoke(int a) {
        System.out.println("i am handsome" + a + "cleaver");
        return a;
    }

    static int Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    static int calculateTheSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(" the sum of natural nmumbers is " + sum);
        return n;
    }

    static int pattrern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
        return n;
    }

    static int PrintEve(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return n ;
    }
// add 2 numbers and return their sum

    static int Sum (int a , int b ){
        int Sum = a+b;
        return Sum;
    }
// prime number

    static void Prime (int n){

        int count  = 0 ;
        for (int i = 1 ; i<=n ; i++){
            if (n%i==0) {
                count++;
                System.out.println(i);
            }
            if (count == 2){
                System.out.println(" this is prime number ");
            }else {

            }
        }

    }

    // print the sum of odd numbers

    static void SumOfOdd (int n ){
        int sum = 0 ;
        for (int i = 1 ; i <=n ; i++) {

            if (i/2!=0){
            sum = sum + i ;

            }
            System.out.println(sum);

        }
        return;
    }

    public static void  main (String [] args){

        tellJoke();
        telljoke(1000);
        Pattern(5);
        calculateTheSum(5);
        pattrern1(5);

        System.out.println(PrintEve(25));
        System.out.println( "the sum of a and b is ");
        System.out.println(Sum(15,78));
        Prime(12);
        System.out.println("the sum of odd number is ");
        SumOfOdd(10);
    }
}
