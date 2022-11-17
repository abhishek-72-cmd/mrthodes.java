import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows ");
        int rows = sc.nextInt();
        System.out.println("enter cols ");
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];
        // input for rows
        for (int i = 0; i < rows; i++) {
            // input for cols
            for (int j = 0; j < rows; j++) {
                number[i][j] = sc.nextInt();

            }
        }
        // for output
        System.out.println("enter x");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (number[i][j]==x){

                    System.out.print("x is found at"+ i + " " + j);

                }
            }
        }
    }
}